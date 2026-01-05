public class TestBubbleSort {


    public static void main(String args[]){


        int arr[] = {2,4,1,6,4,2,9,6,7};

        int length =  arr.length;

        for (int i = 0; i< length-1; i++){
            for (int j=0; j<length-i-1;j++){

                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int s: arr) {
            System.out.println(s);
        }
    }
}
