package StreamsPractice;

import java.util.Optional;

public class OptionalClassPractice {


    /*
    Optional class is a public final class and used to deal with NullPointerException in Java application.
    We must import java.util package to use this class.
    It provides methods that are used to check the presence of value for particular variable.

    */

    public static void main(String[] args) {

        //To avoid the abnormal termination, we use Optional class. In the following example, we are using Optional.
        // So, our program can execute without crashing.
        String[] str = new String[10];
        Optional<String> o = Optional.ofNullable(str[5]);
        if(o.isPresent()){
            System.out.println(str[5].toLowerCase());
        }
        else {
            System.out.println("String value is null");
        }
        o.ifPresent(System.out::println);
        String s = o.get();
        System.out.println(s);

        // If value is present, it returns an Optional otherwise returns an empty Optional
        Optional o1= Optional.of(str[5]);
        Optional check = o1.filter(s1->s1.equals("test"));

    }
}
