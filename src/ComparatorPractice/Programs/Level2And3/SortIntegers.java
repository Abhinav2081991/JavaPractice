package ComparatorPractice.Programs.Level2And3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortIntegers {

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1, 4, 2, 7, 6, 9, 10, 3, 12);

        System.out.println("Before sorting: " + list);

        list.sort(Comparator
                .comparingInt(n -> (Integer)n % 2)
                .thenComparingInt(n -> (Integer)n));

        System.out.println("After sorting: " + list);
    }
}
