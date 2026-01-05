package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {


    public static void main(String[] args) {

        threeSumTwopointerApproach();
        System.out.println("------------------------");
        int nums[] = {-1,0,1,2,-1,-4};

        // sort this array
        //covert to two sum problem

        Arrays.sort(nums);
        Set<List<Integer>> resultSet =  new HashSet<>();

        for(int i=0; i<=nums.length-2; i++){

            int left = i+1;
            int right = nums.length-1;

            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==0){
                        resultSet.add(Arrays.asList(nums[i],nums[left],nums[right]));
                        left++;
                        right--;
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }

        }
        System.out.println(resultSet);
    }

    public static void threeSumTwopointerApproach(){

        int []nums = {-1,0,1,2,-1,-4};
        //Step 1 -  Sort the array.
        Arrays.sort(nums);  // Sorted Array - {-4, -1, -1, 0, 1, 2}
        // Convert to 2 Sum problem.
        // 1. Create a Set of list of integers to store the output.
        Set<List<Integer>> s = new HashSet<>();
        // 2. Loop across the array  from 0 to n-2

        for(int i=0; i<=nums.length-2; i++){
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[left]+nums[right]+nums[i];
                if(sum==0){
                    s.add(Arrays.asList(new Integer[]{nums[left], nums[right], nums[i]}));
                    left++;
                    right--;
                }
                else if (sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        System.out.println(s);
    }



}
