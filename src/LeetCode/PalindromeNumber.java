package LeetCode;

public class PalindromeNumber {


    public void main(String[] args) {

        int input = 121;
        String inputString = String.valueOf(input);

        String output = "";
        for(int i=inputString.length()-1; i>=0; i--){
            output = output+inputString.charAt(i);

        }

        System.out.println(output);


    }
}
