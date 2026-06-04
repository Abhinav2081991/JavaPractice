package JavaEight.PredicatePractice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicatePractice {


    public static void main(String[] args) {
//        Predicate -> this is boolean valued Functional interface. Here we are storing Condition as a variable.

        Predicate<Integer> predicate = x -> x >1000;
        System.out.println(predicate.test(100)); // test() is the abstract method of the Predicate Functional Interface.
        
        Predicate<String> stringStartsWith = x -> x.startsWith("H");
        System.out.println(stringStartsWith.test("HAbhinav")); // test() is the abstract method can be used as String.

        Predicate<String> stringEndsWith = x -> x.endsWith("H");
        System.out.println(stringEndsWith.test("HAbhinav"));

        Predicate<String> and =  stringStartsWith.and(stringEndsWith); // Default method for and condition where multiple predicates are present.
        System.out.println(and.test("ABhinavH"));

        Predicate<String> or =  stringStartsWith.or(stringEndsWith); // Default method for or condition where multiple predicates are present.
        System.out.println(or.test("ABhinavH"));

        Predicate<String> negate = stringEndsWith.negate(); // Default method which negates the boolean result. i.e. true will become false and vice versa.
        System.out.println(negate.test("Jasdas"));

        Predicate<Object> p = Predicate.isEqual("Test");  // Static method of Predicate functional interface.
            // This is used to check the equality of two objects.
        System.out.println(p.test("Test"));


        Student s1  = new Student(4, "Abhinav");
        Student s2  = new Student(2, "Abhinav 1");
        Student s3  = new Student(3, "Abhinav T2iwari");
        Student s4  = new Student(6, "Abhinav Ti3wari");
        Student s5  = new Student(7, "Abhinav Tiw5ari");

        List<Student> list=  new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        Predicate<Student> studentPredicate = x -> x.getId() >3;
        System.out.println(studentPredicate.test(s2));

        List<Student> l = list.stream().filter(studentPredicate).collect(Collectors.toList());

        System.out.println(l);


    }
}

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   @Override
    public String toString(){
        return name + "" + id;
    }

}
