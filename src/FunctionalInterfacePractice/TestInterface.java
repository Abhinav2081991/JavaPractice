package FunctionalInterfacePractice;

@FunctionalInterface
public interface TestInterface {
    public int calculate(int a, int b);

}

// A functional interface can extend another interface only if it does not have any abstract method.
// A function interface in Java is an interface with only one abstract method.

