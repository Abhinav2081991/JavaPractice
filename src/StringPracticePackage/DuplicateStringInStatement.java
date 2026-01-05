package StringPracticePackage;

import java.util.HashSet;
import java.util.Set;

public class DuplicateStringInStatement {

    public static void main(String[] args) {

        String input  = "Abhinav Abhinav Abhinav is a good good programmer";
        String[] str = input.split(" ");
        Set<String> set = new HashSet<>();
        for(String s: str){
            if(set.contains(s)){
                System.out.println("Duplicate is "+ s);
            }else {
                set.add(s);
            }
        }
        System.out.println(set);


    }
}
