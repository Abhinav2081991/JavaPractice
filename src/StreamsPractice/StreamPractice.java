package StreamsPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {


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



    }


}
