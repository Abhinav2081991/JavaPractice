package JavaEight.FunctionPractice;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BiFunctionPractice {

    public static void main(String[] args) {

        // Default method -  "andThen", abstract method - apply()

        BiFunction<String, String, Integer> function1 = (x,y) -> x.length() + y.length() ;
        System.out.println(function1.apply("ABhinav", "Tiwari"));


        BiFunction<String, String, String> function2 = (x,y) -> x.toUpperCase()+y.toUpperCase();
        //Here all the Input and outputs types are same i.e. String. So in this case Binary Operator can be used. BinaryOperator Interface extends
        // BiFunction Interface.

        BinaryOperator<String> binaryOperator = (x, y) -> x.toUpperCase()+y.toUpperCase();
        String s = binaryOperator.apply("Abhinav " , "Tiwari");
        System.out.println(s);

    }
}
