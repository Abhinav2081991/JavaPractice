package ComparatorPractice;

import java.util.Comparator;

public class CompareAgeThenName implements Comparator<Student1> {

    @Override
    public int compare(Student1 s1, Student1 s2) {
        int ageCompare = Integer.compare( s1.getAge(), s2.getAge());
        if(ageCompare !=0){
            return  ageCompare;
        }
        else {
            return s1.getName().compareTo(s2.getName());
        }
    }
}
