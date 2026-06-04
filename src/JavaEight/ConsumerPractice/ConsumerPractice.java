package JavaEight.ConsumerPractice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerPractice {

    public static void main(String[] args) {

        /*
        Consumer is a FUnctional interface which will consume. There is no return type of this.
        Abstract Method is  "accept()"  -- this will just accept and not return anything.
         */

        Consumer<String> consumer1 = x -> System.out.println(x);
        consumer1.accept("Abhinav");

        Consumer<List<Integer>> consumer2 = x -> {
            for(Integer i :x) {
                System.out.println(i + 100);
            }
        };

        Consumer<List<Integer>> consumer3 = x -> {
            for(Integer i :x) {
                System.out.println(i);
            }
        };

       Consumer <List<Integer>> andThenConsumer =  consumer2.andThen(consumer3);
       andThenConsumer.accept(Arrays.asList(1,4,3,6,7));


    }

}
