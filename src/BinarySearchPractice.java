public class BinarySearchPractice {


    public static void main(String[] args) {


        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};

        System.out.println(binarySearch(arr, 6));

    }


    public static int binarySearch(int[] arr, int value) {

        int length = arr.length - 1;
        int start = 0;
        while (start<=length) {
            int mid = start + (length - start) / 2;
            if (arr[mid] == value) {
                return mid;
            }
            else if (value < arr[mid]) {
                length = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }


    public static int binarySearch1(int arr[] , int value){

        int length = arr.length-1;
        int start  = 0;
        while(start <=length){
            int mid =  start + (length-start)/2;
            if(arr[mid]==value){
                return mid;
            }
            else if(value < arr[mid]){
                length = mid -1;
            }
            else {
                start = mid +1;
            }
        }

        return -1;
    }


}
