package ComparatorPractice.Programs.Level2And3;

import java.time.LocalDate;

public class Employee {

    public int salary;
    public  String name;
    LocalDate specificDate;

    public LocalDate getSpecificDate() {
        return specificDate;
    }

    public void setSpecificDate(LocalDate specificDate) {
        this.specificDate = specificDate;
    }

    public Employee(int salary, String name, LocalDate specificDate){
        this.salary=salary;
        this.name = name;
        this.specificDate = specificDate;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
