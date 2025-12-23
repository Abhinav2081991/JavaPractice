package StringPracticePackage;

import java.util.Arrays;

public class FirstLetterCapital {

    public static void main(String[] args) {

        String input = "abhinav tiwari is a good boy";
        String [] strArray = input.split(" ");
        String output = "";
        for(String s: strArray){
            output = output + " " +s.substring(0,1).toUpperCase() + s.substring(1,s.length());

        }
        System.out.println("Output = "+ output);

        // Using Java Streams
        Arrays.asList(strArray).stream().map(s -> s.substring(0,1).toUpperCase()+s.substring(1,s.length()).toLowerCase()).forEach(s -> System.out.println(s));
    }

}
