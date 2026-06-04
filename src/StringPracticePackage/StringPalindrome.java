package StringPracticePackage;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Collections;

public class StringPalindrome {


    public static void main(String[] args) {

        String str = "PARAP";
        StringBuilder sb = new StringBuilder(str);

        System.out.println(sb.reverse() +  "asdasdas");

        System.out.println(str.equals(sb.reverse().toString()));
        String[] strArray =  str.split("");
        String output = "";

        for(int i=strArray.length-1; i>=0;i--){
            output = output + strArray[i];
        }

        System.out.println(output);

        if(str.equals(output)){
            System.out.println("PALINDORME");
        }
        else{
            System.out.println("NOT PALINDORME");
        }

    }
}
