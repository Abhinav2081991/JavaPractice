package NumberPrograms;

public class PerfectNumber {

    /*
    * A perfect number is a positive integer that is equal to the sum of its proper divisors (excluding itself).
        For example: 6 → divisors are 1, 2, 3 → 1+2+3 = 6 → perfect number.*/

    public static void main(String[] args) {

        int num =6;
        int sum = 0;

        for(int i=1; i<=num/2; i++){
            if(num%i==0){
                sum= sum+i;
            }
        }
         if(sum==num){
             System.out.println("Perfect number");
         }
         else{
             System.out.println("Not a perfect number");
         }


    }
}
