package JavaEight.lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {

    public static void main(String[] args) {


        List<Integer> list  = new ArrayList<>();
        list.add(9);
        list.add(91);
        list.add(92);
        list.add(96);
        list.add(97);
        list.add(93);
        list.add(94);
        list.add(95);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        Collections.sort(list, (a,b)-> b-a);  //
//        Here we are giving an implementatble of  abstract Compare method inside Comparator Functional Interface
        // Here we are sorting the list in reverse order.

//        list.sort(Comparator.comparingInt(Integer::intValue).reversed());

        System.out.println(list);
    }
}
