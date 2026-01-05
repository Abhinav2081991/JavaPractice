package StringPracticePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StringAnagram {

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        boolean result = Arrays.equals(a,b);
        System.out.println(result);
    }
}
