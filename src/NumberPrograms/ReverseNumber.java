package NumberPrograms;

public class ReverseNumber {

    public static void main(String[] args) {
        int num =  1234;
        int reverse = 0;
        while (num !=0){
            int lastDigit =  num%10;   // get last digit
            reverse = reverse *10 + lastDigit;
            num = num/10;  // remove the last digit
        }
        System.out.println(reverse);
    }
}
