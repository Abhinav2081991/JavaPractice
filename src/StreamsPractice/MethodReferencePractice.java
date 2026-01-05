package StreamsPractice;


interface TestInterface{
    void testInterfaceAbstractMethod();
}

public class MethodReferencePractice {

    /*
    Java provides a new feature called method reference in Java 8.
    Method reference is used to refer method of functional interface.
    It is compact and easy form of lambda expression.
    Each time when you are using lambda expression to just referring a method, you can replace your lambda expression with method reference.

    There are following types of method references in java:
        Reference to a static method.
        Reference to an instance method.
        Reference to a constructor.

    */

    public static void staticMethod(){
        System.out.println("Static Method Reference");
    }

    public void instanceMethod(){
        System.out.println("Instance Method Reference");
    }

    MethodReferencePractice(){
        System.out.println("Test");
    }

    public static void main(String[] args) {

        //Reference to a static method.
        TestInterface ti = MethodReferencePractice::staticMethod;
        ti.testInterfaceAbstractMethod();

        //Reference to an instance method.
        MethodReferencePractice p  = new MethodReferencePractice();
        TestInterface ti2 = p::instanceMethod;
        ti2.testInterfaceAbstractMethod();
    }
}



    //Reference to a constructor

interface Messageable{
    Message getMessage(String msg);
}
class Message{
    Message(String msg){
        System.out.print(msg);
    }
}
class ConstructorReference {
    public static void main(String[] args) {
        Messageable hello = Message::new;
        hello.getMessage("Hello");
    }
}
