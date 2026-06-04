package JavaEight.FunctionPractice;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MoreFunctionPractice {

    public static void main(String[] args) {


        /*
        R apply(T t); -- abstract method of functional interface.

         default method  - "andThen(<Function>)   --> this also returns a function."

         default method - "compose" works opposite to andThen method.

         */

        Function<String, String> function1 = s -> s.toUpperCase();
        Function<String, String> function2 = s -> s.substring(0,3);


        Function<String, String> mainFunction = function1.andThen(function2);
        String s = mainFunction.apply("abhinav");
        System.out.println(s);

        System.out.println(function1.andThen(function2).apply("tiwari"));


        Function<Integer,Integer> function3  =  x -> x *2;
        Function<Integer,Integer> function4  =  x -> x * x * x;

        System.out.println(function3.andThen(function4).apply(3)); //216  function3 is applied first and then function4
        System.out.println(function4.andThen(function3).apply(3)); //54  function4 is applied first and then function3

        System.out.println(function3.compose(function4).apply(3)); // 54  --> function 3 us applied first then function 3


        /*
        We have identity function i.e a Static method of 'Function' Functional Interface which returns whatever input is passed.

         */

        Function<String, String> identityFunction = Function.identity();
        System.out.println(identityFunction.apply("Abhinav")); // this will return "Abhinav" as "Abhinav" was provided as input.

        Function<String, String> function5 = str -> str.toUpperCase();
        /*
        If the Function accepts and returns same types, then in this case UnaryOperator can be used. UnaryOperator Interface extends Function Interface.
         */
        UnaryOperator<String> unaryOperator = str -> str.toUpperCase();
        System.out.println(unaryOperator.apply("abhinav"));


    }
}
