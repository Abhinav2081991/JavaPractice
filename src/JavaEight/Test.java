package JavaEight;

import java.util.ArrayList;
import java.util.List;

public class Test {



    public static void main(String[] args) {

        Student s1 = new Student(1, "A1", 11);
        Student s2 = new Student(2, "A2", 12);
        Student s3 = new Student(3, "A3", 13);
        Student s4 = new Student(4, "A4", 14);


        List<Student> list = new ArrayList<>();

        list.stream().map(x -> x.getAge()+1);

    }




}



class Student{

    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    String name;
    int id;

    public Student(int age, String name , int id){
        this.age = age;
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString(){
        return "Age- "+age + "Name- "+name +"id -"+ id;
    }


}
