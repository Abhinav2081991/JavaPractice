public abstract class AbstractClassPractice {

    public static String name = "Static variable name Abhinav Tiwari";
    public String testInstanceVariable = "Instance Variable of an abstract class";

    public void abstractMethod() {
        // Method without any body inside it
    }

    public void testConcreteMethod(){
        System.out.println("This will invoke concrete method of an abstract method");
    }

    public AbstractClassPractice(){
        System.out.println("Invoking Constructor of a abstract class");
    }

    public static void testStaticConcreteMethod(){
        System.out.println("Invoking static method of an astract class");


    }

}

class AbstractClassUSage extends AbstractClassPractice{


    public void test() {
        AbstractClassPractice.testStaticConcreteMethod();
        System.out.println(testInstanceVariable);
        System.out.println(AbstractClassPractice.name);

        // We cannot create an object of Abstract class.
        //AbstractClassPractice a1 =  new AbstractClassPractice();
    }

    public void abstractMethod(){
        System.out.println("Implementation of Abstract method");
    }

    public static void main(String[] args) {
        AbstractClassUSage a  =  new AbstractClassUSage();
        a.test();
        a.abstractMethod();

    }


    }
