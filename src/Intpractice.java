import java.util.Scanner;

public class Intpractice {


    public static void main(String[] args) {

        int num = 123456789;
        String str = Integer.toString(num);
        String num1 = String.valueOf(num);
        for(int i=0; i<str.length(); i++){

            System.out.println(Character.getNumericValue(str.charAt(i)));

        }


    }





}
