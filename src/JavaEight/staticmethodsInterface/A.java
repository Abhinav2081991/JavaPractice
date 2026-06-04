package JavaEight.staticmethodsInterface;

public interface A {

    public static void test() {
        System.out.println("Invoking Static methods");
    }

    default void testDefault(){
        System.out.println("Invoking default method from the interface");
    }

}

class Myclass implements A{


    // Implementation can never see Static methods inside the interface.
    // so below example is not an example of override
    public static void test() {  // this is a separate methods inside the implementation class.
        System.out.println("Invoking Static method s" );
    }

    public static void main(String[] args) {
        Myclass myclass =  new Myclass();
        myclass.testDefault();

        A.test();  // Static methods from any class can be called using InterfaceName.staticmethod name
    }

}
