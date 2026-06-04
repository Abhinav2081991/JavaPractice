package ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayComparision {


    public static void main(String[] args) {

        int arr1[] = {1,4,3,6,8,5,3,1,3};
        int arr2[] = {1,4,3,6,8,5,3};

        int start =0;
        int end = arr1.length-1;

        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]);
        }

        System.out.println("  ddd");
        while(start<end){
            if(arr1[start] > arr1[end]){
                int temp = arr1[start];
                arr1[start] = arr1[end];
                arr1[end] = temp;
            }
            start++;
            end--;

        }
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]);
        }



        System.out.println(Arrays.compare(arr1, arr2));

        System.out.println(Arrays.mismatch(arr1, arr2));

        System.out.println(Arrays.equals(arr1, arr2));


    }
}
