package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        //{2,2,2,7};   9
        int[] output = new int[nums.length];
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    output = new int[]{i, j};
                }
            }
        }
        return output;
    }

    public int[] twoSumUsingHashMap(int[] nums, int target) {

        HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0; i<nums.length; i++){
            hm.put(nums[i], i);
        }
        for(int i=0; i< nums.length;i++){
            int compliment =  target -  nums[i];
            if(hm.containsKey(compliment)&& hm.get(compliment)!=i){
                return new int[] {i,hm.get(compliment)};
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {

        int nums[] = {5,2,4};
        int target = 6;

        TwoSum ts = new TwoSum();
        int output[] = ts.twoSum(nums, target);
        int output1[] = ts.twoSumUsingHashMap(nums, target);

        for(int i: output1){
            System.out.println(i);
        }

        for(int i: output){
            System.out.println(i);
        }

        int [] output3 = ts.testTwoSumWithHashMap(nums, target);
        for(int i: output3){
            System.out.println(i);
        }
    }


    public int[] testTwoSumWithHashMap(int[] nums, int target){

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<=nums.length-1; i++){
            hm.put(nums[i], i);
        }
        for(int i=0; i<=nums.length-1; i++){
            int compliment = target - nums[i];
            if(hm.containsKey(compliment) && hm.get(compliment)!=i){
                return new int[]{i, hm.get(compliment)};
            }
        }
        return new int[] {};
    }



}
