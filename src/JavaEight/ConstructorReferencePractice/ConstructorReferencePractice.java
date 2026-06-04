package JavaEight.ConstructorReferencePractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConstructorReferencePractice {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Abhinav", "Abhishek", "Anubhav");

        List<Student> studentList = list.stream().map(x -> new Student(x)).collect(Collectors.toList());
        // Here we are storing the names from String list in to the Name attribute to Student class.

        //so instead of using lambda expression we can use Constructor reference like below

        List<Student> studentList1 = list.stream().map(Student :: new).collect(Collectors.toList());


        List<Student> list1 = list.stream().map(Student::new).collect(Collectors.toList());

        List<String> l = list.stream().map(x -> new Student(x).getName()).collect(Collectors.toList());
    }
}
