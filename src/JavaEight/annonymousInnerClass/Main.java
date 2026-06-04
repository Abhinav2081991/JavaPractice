package JavaEight.annonymousInnerClass;

public class Main {

    int a =10; // This ins instance variable whos scope is "Main" class. This cannot be used inside annonymous inner class.

    public static void main(String[] args) {


        Employee employee = new Employee() {
            int b = 8;    // this is instance variable of an annonymous inner class
            @Override
            public String getSalary() {
                System.out.println(this.b);
                return "100";
            }
 // This is Anonymous inner class where we are implementing both the abstract methods of the interface.
//            Also, there is no use of Implementation class separately.
           // a =9;   // Here we cannot change the variable because the scope is annonymous inner class.
            @Override
            public String getDesignation() {
                return "Software Engineer";
            }
        };

        System.out.println(employee.getSalary());
        System.out.println(employee.getDesignation());


    }
}
