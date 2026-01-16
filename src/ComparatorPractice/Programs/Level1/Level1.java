package ComparatorPractice.Programs.Level1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Level1 {

    public static void main(String[] args) {

//        1️⃣ Sort integers in descending order
        List<Integer> nums = Arrays.asList(4, 1, 9, 3);
        nums.sort(Comparator.reverseOrder());
        System.out.println(nums);

//        2️⃣ Sort strings by length (shortest first)
        List<String> names = Arrays.asList("Java", "Python", "C");
        names.sort(Comparator.comparingInt(String::length));

//        3️⃣ Sort strings by length, if equal then alphabetically
        List<String> words = Arrays.asList("bat", "apple", "cat", "ant");
        words.sort(Comparator.comparingInt(String::length).thenComparing(String::compareTo));
        System.out.println(words);

//        Final Interview Tip (VERY IMPORTANT)
//        Enums + Comparator chaining = cleanest real-world sorting solution

    }


}
