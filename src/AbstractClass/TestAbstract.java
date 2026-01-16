package AbstractClass;

public abstract class TestAbstract {

    public String test;

    public TestAbstract(String test){
        this.test = test;
        System.out.println("Abstract class called: " + test);
    }

    public abstract void testMethod();

}

class ConcreteClass extends TestAbstract{


    public ConcreteClass(String test) {
        super(test);
    }

    @Override
    public void testMethod() {
        System.out.println("Abstract Method Implemented");
    }

    public static void main(String[] args) {

        TestAbstract a = new ConcreteClass("Abhinav");
        System.out.println(a.toString());
        a.testMethod();
    }
}
