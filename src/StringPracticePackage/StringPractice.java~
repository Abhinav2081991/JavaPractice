package StringPracticePackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class StringPractice {

    public static void main(String[] args){
        System.out.println(reverseToggle("Abhinav Tiwari is a Good Programmer"));
        System.out.println(checkAnagram("aman is","anam is"));
        checkCharacters("ABHINAV 12HS 22Ja TIARI!@#$");
        checkDuplicates("opop");
    }

    /**
     * Reverse Toggle a String.
     * @param inputString
     * @return String value
     */
    public static String reverseToggle(String inputString){

        String outputString = "";
        String toggleString = "";
        char[] charArray =  inputString.toCharArray();
        StringBuilder sb = new StringBuilder(outputString);
        for(Character c :charArray) {
            if(Character.isUpperCase(c)){
                c= Character.toLowerCase(c);
            }else {
                c= Character.toUpperCase(c);
            }
            toggleString =  sb.append(String.valueOf(c)).toString();
        }
        String[] strArray = toggleString.split(" ");
        for(String s : strArray){
            StringBuilder sb1 =  new StringBuilder(s);
            outputString = outputString + " "+ sb1.reverse();
        }
        return outputString;
    }

    /**
     * Program to check if a string is anagram or not.
     * @param string1
     * @param string2
     * @return
     */
    public static boolean checkAnagram(String string1, String string2){

        char[] a1 = string1.toCharArray();
        char[] a2 = string2.toCharArray();
        System.out.println(a1);
        System.out.println(a2);
        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println(a1);
        System.out.println(a2);
        return Arrays.equals(a1, a2);
    }

    /**
     * Check percentage of characters
     * @param inputstring
     */

    public static void checkCharacters(String inputstring){

        char[]charArray =  inputstring.toCharArray();
        int totalCharacters = charArray.length;
        int uppercase  = 0;
        int lowercase  = 0;
        int specialchar = 0;
        int space = 0;
        for(char c: charArray){
            if(Character.isLowerCase(c)){
               lowercase = lowercase+1;
            }
            else if(Character.isUpperCase(c)){
                uppercase = uppercase+1;
            }else if(Character.isSpaceChar(c)){
                space =  space+1;
            }else {
                specialchar = specialchar + 1;
            }
        }
        System.out.println("Total Characters are - "+ totalCharacters);
        System.out.println("Lowercase Characters are - "+ (lowercase *100/ totalCharacters)+"%");
        System.out.println("Uppercase Characters are - "+ (uppercase *100/ totalCharacters)+"%");
        System.out.println("Space Characters are - "+ (space *100/ totalCharacters)+"%");
        System.out.println("Special Characters are - "+ (specialchar *100/ totalCharacters)+"%");

    }

    /**
     * Check duplicates in a string
     * @param inputString
     */
    public static void checkDuplicates(String inputString){
        char[] charArray = inputString.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c: charArray){
            if(hm.containsKey(c))
            {
                hm.put(c, hm.get(c)+1);
            }
            else
            {
                hm.put(c,1);
            }
        }
        Set<Character> set = hm.keySet();
        for(char c: set){
            if(hm.get(c)>1){
                System.out.println("Ch "+ c +" is " + hm.get(c));
            }
        }
    }

}
