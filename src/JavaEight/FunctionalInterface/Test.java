package JavaEight.FunctionalInterface;

public class Test {


    public static void main(String[] args) {

        TestInterface add  = (a,b)-> a+b;

        System.out.println(add.calculate(5,7));

        TestInterface multiply = (a,b)->a*b;

        System.out.println(multiply.calculate(6,7));

    }
}
