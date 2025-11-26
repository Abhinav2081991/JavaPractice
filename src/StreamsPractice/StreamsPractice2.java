package StreamsPractice;

import java.util.Arrays;
import java.util.List;

public class StreamsPractice2 {

    public static void main(String[] args) {
        List<Integer> numbers
                = Arrays.asList(11, 22, 33, 44,
                55, 66, 77, 88,
                99, 100, 100);

        System.out.println(numbers.stream().filter(s -> (s%2)==0)
                .mapToInt(e->e*2).sum());
    }

}
