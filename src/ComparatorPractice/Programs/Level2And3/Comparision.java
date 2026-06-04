package ComparatorPractice.Programs.Level2And3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Comparision  {


    public static void main(String[] args) {
        Employee e1 = new Employee(100, "Test", LocalDate.of(2025, 01, 01));
        Employee e2 = new Employee(103, "Aest", LocalDate.of(2025, 03, 03));
        Employee e3 = new Employee(102, "Gest", LocalDate.of(2025, 04, 04));
        Employee e4 = new Employee(105, "Best", LocalDate.of(2025, 02, 02));
        Employee e5 = new Employee(0, "", LocalDate.now());


        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        for (Employee e : list) {
            System.out.println("Before: " + e.name + "," + e.salary + ", " + e.specificDate);
        }

        list.sort((a, b) -> b.salary - a.salary ); // sorting based on Salary in descending order.

        for (Employee e : list) {
            System.out.println("After: " + e.name + "," + e.salary + ", " + e.specificDate);
        }

        for (Employee e : list) {
            System.out.println("Before: " + e.name + "," + e.salary + ", " + e.specificDate);
        }

        list.sort(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder()).thenComparing(Employee::getName, Comparator.nullsFirst(String::compareTo)));


        for (Employee e : list) {
            System.out.println("After: " + e.name + "," + e.salary + ", " + e.specificDate);
        }

        list.sort(Comparator.comparing(Employee::getSpecificDate));

        for (Employee e : list) {
            System.out.println("After Date: " + e.name + "," + e.salary + ", " + e.specificDate);
        }

//        🔟 Sort employees by department, salary (desc), name
//        employees.sort(
//                Comparator.comparing(Employee::getDepartment)
//                        .thenComparing(Employee::getSalary, Comparator.reverseOrder())
//                        .thenComparing(Employee::getName)
//        );


//        1️⃣1️⃣ Sort objects with null names (nulls last)
//        employees.sort(
//                Comparator.comparing(
//                        Employee::getName,
//                        Comparator.nullsLast(String::compareTo)
//                )
//        );


//        1️⃣3️⃣ Sort strings by vowel count (desc), then length
//        Comparator<String> vowelComparator = Comparator
//                .comparingInt((String s) ->
//                        s.replaceAll("[^aeiouAEIOU]", "").length()
//                ).reversed()
//                .thenComparingInt(String::length);
//
//        words.sort(vowelComparator);


//        1️⃣4️⃣ Sort numbers to form largest possible number
//        Input: [3, 30, 34, 5, 9]
//        Output: 9534330
//
//        numbers.sort((a, b) -> (b + a).compareTo(a + b));

    }
}
