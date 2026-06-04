package JavaEight.FunctionPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionPractice {


    // Function is also a functional interface which performs a function by getting input and returning an output.
        // Abstract method  is " R apply(T t)" T is generic for input, R is generic of Return type.





    public static void main(String[] args) {

        Function<String, Integer>  function = x -> x.length();
        System.out.println(function.apply("Abhinav"));
        Function<String, String> function2 = x -> x.substring(0,3);

        System.out.println(function2.apply("ABhinav"));

        Function<List<Student>, List<Student>> startswithPrefix = x -> {

            List<Student> result = new ArrayList<>();
            for(Student s : x){
                if(function2.apply(s.getName()).equalsIgnoreCase("ari")){
                    result.add(s);
                }
            }
            return  result;
        };

        Student s1 = new Student(1,"Abhinav");
        Student s2 = new Student(2,"Abhinav Tiwari");
        Student s3 = new Student(4,"Abhinav  abc");
        Student s4 = new Student(3,"ari Abhinav asdj");

        List<Student> students = Arrays.asList(s1, s2, s3, s4);

        List<Student> filteredStudents = startswithPrefix.apply(students);

        System.out.println(filteredStudents);


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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
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


}

