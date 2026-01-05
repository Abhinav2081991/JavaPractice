package NumberPrograms;

import java.util.Arrays;

public class ArmstrongNumber {

    public static void main(String[] args) {

        int num = 153;
        String[] str = String.valueOf(num).split("");
        int  total = Arrays.stream(str).sorted().mapToInt(s -> (int) Math.pow(Integer.parseInt(s),3)).sum();
        System.out.println(total);
        if(num==total){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an Armstrong Number");
        }
    }
}
