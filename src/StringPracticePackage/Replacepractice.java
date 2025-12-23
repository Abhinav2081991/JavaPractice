package StringPracticePackage;

public class Replacepractice {


    public static void main(String[] args) throws ArithmeticException{


        String a = "Abhinav";
        String b = "Tiwari";

        String c = a.join("TEST", a,b);

        System.out.println(c);

        a = a.replace('A', 'm');
        System.out.println(a);

        char[] ch = new char[10];
        a.getChars(1, 3, ch, 0);

        System.out.println(ch);
    }
}
