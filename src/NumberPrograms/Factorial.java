package NumberPrograms;

public class Factorial {

    public static void main(String[] args) {
        fact(5);
        System.out.println(fact2(5));
    }

    public static void fact(int num){
        int fact =1;
        for (int i=1; i<=num; i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }


    public static int fact2(int num){
        if(num==1||num==0){
            return 1;
        }
        else {
            return num * fact2(num-1);
        }
    }
}
