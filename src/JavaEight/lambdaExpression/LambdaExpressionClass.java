package JavaEight.lambdaExpression;

public class LambdaExpressionClass {

    public static void main(String[] args) {
        Employee employee = () -> "Software Enginner";  // Here we are giving an implementation of the functional interface.
        System.out.println(employee.getName());

        Employee employee1 = () -> "Editor";
        System.out.println(employee1.getName());
    }

    ///  Interface reference can be  used to hold lambda expression.
    ///  Using Lambda expression we don't need to use a separate implementation class. i.e. SoftwareEngineerRegularImplementation class is not required for implementation.
}
