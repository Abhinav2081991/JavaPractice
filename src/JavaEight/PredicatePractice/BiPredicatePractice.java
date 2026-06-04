package JavaEight.PredicatePractice;

import java.util.function.BiPredicate;

public class BiPredicatePractice {

    public static void main(String[] args) {

        BiPredicate<Integer, Integer> predicate = (x,y) -> x%2==0 && y%2==0;
        System.out.println(predicate.test(7, 6));  // false


    }

}
