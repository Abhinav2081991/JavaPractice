package CollectionPrograms;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {


    public static void main(String[] args) {

        LinkedList<String> list  = new LinkedList<>();

        list.add("Tiwari");
        list.add("Is");
        list.add("Good");
        list.add("Man");
        list.add("Abhinav");

        System.out.println(list);

        list.removeIf(s -> s.contains("Man"));

        System.out.println(list.contains("Abhinav"));

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());

        System.out.println(list);

    }
}
