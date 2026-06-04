package StringPracticePackage;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String input1 = "listen";
        String input2 = "silent";

        char[] strArray1 = input1.toCharArray();
        char[] strArray2 = input2.toCharArray();

        System.out.println(strArray1);
        System.out.println(strArray2);

        Arrays.sort(strArray1);
        Arrays.sort(strArray2);

        System.out.println(strArray1);
        System.out.println(strArray2);
        String output1 = "";
        for(Character c : strArray1){
            output1 = output1 + c;
        }
        String output2 = "";
        for(Character c : strArray2){
            output2 = output2 + c;
        }
        System.out.println(output2);

        if(output1.equals(output2)){
            System.out.println("Strings are anagram");
        }
        else{
            System.out.println("not anagram");
        }




    }
}
