package JavaEight.ConsumerPractice;

import java.util.function.BiConsumer;

public class BiConsumerPractice {

    public static void main(String[] args) {


        BiConsumer<Integer, Integer> consumer1 = (x,y) -> System.out.println(x+y);

        BiConsumer<Integer, Integer> consumer2 = (x,y) -> System.out.println(x*y);

        BiConsumer<Integer, Integer> bi = consumer1.andThen(consumer2);
        bi.accept(6,7);


    }
}
