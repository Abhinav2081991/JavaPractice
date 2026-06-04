package ArrayProblems;

import java.util.Arrays;

public class SortArraywithZerosAtEnd {

    public static void main(String[] args) {
        int[] input = {0,1,12,5,3,0,2,0};
        int[] nonZero = new int[input.length];
        int  index = 0;

        for(int num :input){
            if(num!=0){
                nonZero[index++] = num;
            }
        }
        Arrays.sort(nonZero, 0,index);

        for(int i =0; i< nonZero.length; i++){
            System.out.println(nonZero[i]);
        }
    }
}
