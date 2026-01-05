package InterfacePractice;

public class TestInterfaceClass implements TestInterface{
    @Override
    public void test() {
        System.out.println("implementation of interface method");
    }


    public static void main(String[] args) {

        TestInterfaceClass t = new TestInterfaceClass();
        t.testWIthBody();
        t.test();
         TestInterface.testStaticMethodWithBody();
         t.test1();
    }
}
