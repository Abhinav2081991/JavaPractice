package ArrayPractice;

import java.util.Arrays;

public class LeftRotateArray {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        int k = 2;
        System.out.println("After rotating " +k+ " times");
        leftRotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * This will reverse the array
     */
    public static void reverseArrary(int[] arr, int start, int end){

        while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end --;
        }
    }

    /**
     * Method to left rotate an array k times.
     * @param arr
     * @param k
     */
    public static void leftRotate(int arr[], int k){

        //figure out the length of the array
        int n = arr.length;

        //handle if k > n
        k = k%n;

        if(k==0){  // If K =0 then no rotation needed
            return;
        }

        //reverse the first part 0 to k-1
        reverseArrary(arr, 0, k-1);

        //reverse the second part k to n-1
        reverseArrary(arr, k, n-1);

        //reverse the entire array 0 to n-1
        reverseArrary(arr, 0, n-1);
    }
}
