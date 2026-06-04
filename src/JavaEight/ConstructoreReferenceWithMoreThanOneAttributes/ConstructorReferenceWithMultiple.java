package JavaEight.ConstructoreReferenceWithMoreThanOneAttributes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConstructorReferenceWithMultiple {

    public static void main(String[] args) {

        Student s1 = new Student("Abhinav", 11, "Bilaspur");
        Student s2 = new Student("Abhishek", 14, "Raipur");
        Student s3 = new Student("Gaurav", 12, "Janjgir");
        Student s4 = new Student("Shivam", 19, "Korba");
        Student s5 = new Student("Shrikant", 20, "Champa");

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        List<Student> l =list.stream().map(x -> new Student(x.getName(), x.getAge(), x.getCity())).collect(Collectors.toList());

        System.out.println(l);





    }




}
