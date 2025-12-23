package StringPracticePackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

public class CheckSameCharacters {


    public static void main(String[] args) {




        String s1 = "aabbcc";
        String s2 = "abc";



        String[] strArray1 = s1.split("");
        String[] strArray2 = s2.split("");


        Set<String> set1 = Arrays.stream(strArray1).collect(Collectors.toSet());

        Set<String> set2 = Arrays.stream(strArray1).collect(Collectors.toSet());

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set1.equals(set2));

//            String car , bus = "petrol";
//            car = car + bus; // compilation error
//            System.out.println(car);


    }
}
