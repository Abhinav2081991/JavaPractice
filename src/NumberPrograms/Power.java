package NumberPrograms;

public class Power {

    public static void main(String[] args) {
        int num = 2;
        int exponent = 5;
        int result = 1;

        while(exponent>0){
             result = result * num;
             exponent--;
        }
        System.out.println(result);
    }
}
