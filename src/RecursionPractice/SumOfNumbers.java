package RecursionPractice;

public class SumOfNumbers {

    public static void main(String[] args) {

              int n = sumOfNumbers(6);
        System.out.println(n);
    }


    public static int sumOfNumbers(int n){
        if(n!=0) {
            return n + sumOfNumbers(n - 1);
        }
        else return n;
    }


}
