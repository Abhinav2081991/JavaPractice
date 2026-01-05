package ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayComparision {


    public static void main(String[] args) {

        int arr1[] = {1,4,3,6,8,5,3,1};
        int arr2[] = {1,4,3,6,8,5,3};


        System.out.println(Arrays.compare(arr1, arr2));

        System.out.println(Arrays.mismatch(arr1, arr2));

        System.out.println(Arrays.equals(arr1, arr2));


    }
}
