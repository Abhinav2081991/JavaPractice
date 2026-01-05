package ArrayPractice;

import java.util.Arrays;

public class LargestNumberInArray {

    public static void main(String[] args) {

        int arr[] = {1,5,3,8,6,4,6};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-1] + " and "+ arr[arr.length-2]);
    }
}
