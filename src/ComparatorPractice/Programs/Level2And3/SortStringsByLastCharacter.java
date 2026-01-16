package ComparatorPractice.Programs.Level2And3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringsByLastCharacter {

    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Delhiz", "Paris", "London");
        cities.sort(Comparator.comparing(s -> s.charAt(s.length()-1)));
        for(String s : cities){
            System.out.println(s);
        }
    }

}
