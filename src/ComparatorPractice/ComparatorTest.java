package ComparatorPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {


    public static void main(String[] args) {

        Student1 s1 = new Student1("ABhi", 15, 20);
        Student1 s2 = new Student1("hgg", 12, 21);
        Student1 s3 = new Student1("rttt", 11, 19);
        Student1 s4= new Student1("AAAA", 19, 18);

        ArrayList<Student1> list = new ArrayList<Student1>();

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        for(Student1 a: list){
            System.out.println(a.age +" "+ a.id +" "+ a.name);
        }
        
        Collections.sort(list, new AgeComparator());
        for(Student1 a: list){
            System.out.println(a.age +" "+ a.id +" "+ a.name);
        }

        Collections.sort(list, new NameComparator());

        for(Student1 a: list){
            System.out.println(a.age +" "+ a.id +" "+ a.name);
        }
    }





}
