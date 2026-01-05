package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class MaxSubstring {

    public static void main(String[] args) {

        String str = "pwwkewadasdasdasd";
        int left = 0;
        int right = 0;
        int subString_max_length = 0;
        int maxStart = 0;
        List<Character> list = new ArrayList<Character>();

        while(right<str.length()){
            if(!list.contains(str.charAt(right))){
                list.add(str.charAt(right));
                right++;
//                subString_max_length = Math.max(subString_max_length, list.size());
                if (list.size() > subString_max_length) {
                    subString_max_length = list.size();
                    maxStart = left;
                }
            }
            else{

                list.remove(Character.valueOf(str.charAt(left)));
                left++;
            }
        }
        System.out.println(subString_max_length);
        System.out.println(str.substring(maxStart, maxStart+subString_max_length));

        System.out.println(maxSubstring("pwwkewadasdasdasd"));
    }

    public static int maxSubstring(String str){

        int left=0;
        int right=0;
        int max_length = 0;
        List<Character> list = new ArrayList<>();
        while(right<str.length()){
            if(!list.contains(str.charAt(right))){
                list.add(str.charAt(right));
                right++;
                max_length = Math.max(max_length, list.size());
            }
            else{
                list.remove(Character.valueOf(str.charAt(left)));
                left++;
            }
        }
        return max_length;
    }
}
