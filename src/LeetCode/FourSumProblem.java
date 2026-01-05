package LeetCode;

import java.util.*;

public class FourSumProblem {

    public static void main(String[] args) {

//        int[] nums = {1, 0, -1, 0, -2, 2, 3, -1, -2};
//        int[] nums = {-3,-1,0,2,4,5};
        int[] nums = {1000000000,1000000000,1000000000,1000000000};
        int target = -294967296;
        // sort this array
        Arrays.sort(nums);  //{-2,-1,0,0,1,2}
        // Convert to 3 sum problem.
        Set<List<Integer>> s = new HashSet<>();

        // loop 2 times.   i = 0 to n-2, j= i+1 to n-1

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j <= nums.length - 2; j++) {
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        s.add(Arrays.asList(new Integer[]{nums[i], nums[j], nums[left], nums[right]}));
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        System.out.println(s);


    }

    public List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);  //{-2,-1,0,0,1,2}
        // Convert to 3 sum problem.
        Set<List<Integer>> s = new HashSet<>();
        // loop 2 times.   i = 0 to n-2, j= i+1 to n-1
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j <= nums.length - 2; j++) {
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == 0) {
                        s.add(Arrays.asList(new Integer[]{nums[i], nums[j], nums[left], nums[right]}));
                        left++;
                        right--;
                    } else if (sum < 0) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return new ArrayList<>(s);
    }
}
