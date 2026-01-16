package StringPracticePackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxSubstring {


    public static void main(String[] args) {

            String str = "dasiugdjagsjdgasdasasdas";
            int left = 0;
            int right = 0;
            int max_length = 0;
            int maxStart = 0;
            List<Character> list = new ArrayList<>();

            while (right<str.length()){
                if(!list.contains(str.charAt(right))){
                    list.add(str.charAt(right));
                    right++;
                    if(list.size()>max_length){
                        max_length = list.size();
                        maxStart = left;
                    }
                }
                else {
                    list.remove(Character.valueOf(str.charAt(left)));
                    left++;
                }

            }

        System.out.println(max_length);
        System.out.println(str.substring(maxStart, maxStart+max_length));


    }


    

}
