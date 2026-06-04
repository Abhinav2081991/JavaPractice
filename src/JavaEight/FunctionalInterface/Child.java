package JavaEight.FunctionalInterface;

@FunctionalInterface
public interface Child extends TestInterface{

//    public int divide(int a , int b); // Have this method will give error because the parent Functional Interface has a public abstract method

    default void calculations(int a , int b){};   // Child functional interface can have default and static methods.

    static void test(){}//

    public int calculate(int a , int b); // Defining the same method as the parent Functional Interface also makes the child Interface as Functional Interface.

}

// If the interface is empty then also it's called as Functional Interface
