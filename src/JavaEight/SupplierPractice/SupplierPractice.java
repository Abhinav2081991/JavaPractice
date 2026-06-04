package JavaEight.SupplierPractice;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierPractice {


    public static void main(String[] args) {
        /*
        Supplier Functional interface doesn't accept anything, but just returns.
         there is only one abstract method i.e. "T get()"
         */

        Supplier<Integer> supplier = () -> 100;
        System.out.println(supplier.get());


        Predicate<Integer> predicate = x -> x%2==0;
        Function<Integer, Integer> function = x -> x*x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier2 = () -> 200;

        if(predicate.test(supplier2.get())){
            consumer.accept(function.apply(supplier2.get()));
        }

    }

    // There is no BiSupplier Interface.
}
