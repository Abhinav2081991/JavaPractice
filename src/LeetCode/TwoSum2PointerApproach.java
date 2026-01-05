package LeetCode;

import java.util.Arrays;

public class TwoSum2PointerApproach {

    public static void main(String[] args) {

        int [] nums = {5,2,4,3,3};  // 2,4,5.......2,3,3,4,5
        int target = 6;

        Arrays.sort(nums);

        int left = 0;
        int right =nums.length-1;

        while(left<right){
            int sum = nums[left]+nums[right];
            if(sum==target){
                System.out.println("left = "+ left +" right" + right );
                break;
            }
            else if (sum > target){
                right--;
            }
            else{
                left++;
            }
        }
    }
}
