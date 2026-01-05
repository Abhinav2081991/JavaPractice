package AbstractClass;

public abstract class TestAbstract {

    public String test;

    public TestAbstract(String test){
        this.test = test;
        System.out.println("Abstract class called: " + test);
    }

}

class ConcreteClass extends TestAbstract{


    public ConcreteClass(String test) {
        super(test);
    }

    public static void main(String[] args) {

        TestAbstract a = new ConcreteClass("Abhinav");
        System.out.println(a.toString());
    }
}
