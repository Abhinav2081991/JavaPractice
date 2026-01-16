package ComparatorPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {


    public static void main(String[] args) {

        Student1 s2 = new Student1("Tiwari", 15, 21);
        Student1 s1 = new Student1("Abhinav", 15, 20);
        Student1 s3 = new Student1("rttt", 11, 19);
        Student1 s4= new Student1("AAAA", 19, 18);

        ArrayList<Student1> list = new ArrayList<Student1>();

        list.add(s2);
        list.add(s1);
        list.add(s3);
        list.add(s4);

        for(Student1 a: list){
            System.out.println(a.age +" "+ a.id +" "+ a.name);
        }
        System.out.println("-------Default----------------------------------");

        Collections.sort(list, new NameComparator());

        for(Student1 a: list){
            System.out.println(a.age +" "+ a.id +" "+ a.name);
        }
        System.out.println("------------Name-----------------------------");

        Collections.sort(list, new AgeComparator());
        for(Student1 a: list){
            System.out.println(a.age +" "+ a.id +" "+ a.name);
        }
        System.out.println("-----------Age------------------------------");

        Collections.sort(list, new CompareAgeThenName());
        for(Student1 a: list){
            System.out.println(a.age +" "+ a.id +" "+ a.name);
        }
        System.out.println("--------------AgeThenName---------------------------");
//        Another way:

        System.out.println("--------------AgeThenName Another way---------------------------");
        list.sort(Comparator.comparing(Student1::getAge).thenComparing(Student1::getName));
        for(Student1 a: list){
            System.out.println(a.age +" "+ a.id +" "+ a.name);
        }

        System.out.println("--------------AgeThenName Another way -- reversed order---------------------------");
        list.sort(Comparator.comparing(Student1::getAge).thenComparing(Student1::getName).reversed());
        for(Student1 a: list){
            System.out.println(a.age +" "+ a.id +" "+ a.name);
        }
    }





}
