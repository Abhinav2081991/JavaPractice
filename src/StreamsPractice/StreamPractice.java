package StreamsPractice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {

    //A stream, in Java, is a sequence of elements that can be processed in parallel or sequentially

    public static void main(String[] args) {
        ArrayList<String> a =  new ArrayList<>();
        a.add("ABhinav7");
        a.add("abhinav7");
        a.add("abhinav7");
        a.add("abhinav3");
        a.add("abhinav4");
        a.add("ABhinav5");
        a.add("ABhinav6");

//        System.out.println(a.stream().filter(s-> s.startsWith("A")).count());

//        a.stream().forEach(s-> System.out.println(s));

//        a.stream().map(s->s.substring(0,1)+s.substring(1, s.length()).toUpperCase()).forEach(s-> System.out.println(s));


//        a.stream().sorted().forEach(s-> System.out.println(s));

//        boolean  b =  a.stream().anyMatch(s->s.contains("10"));
//        System.out.println(b);

//        a.stream().distinct().forEach(s-> System.out.println(s));

        List<String> l = a.stream().sorted().collect(Collectors.toList());
        for(String s: l){
            System.out.println(s);
        }

        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);


        List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println("Filtered List: " + filtered);
        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("Merged String: " + mergedString);


        List numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> (int) x).summaryStatistics();
        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());


        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        int sum = nums.parallelStream().mapToInt(s -> s).sum();   // Use parallel stream for concurrent processing
        System.out.println("Sum is ---------- :"+sum);

    }


}
