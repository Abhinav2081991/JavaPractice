package JavaEight.lambdaExpression;

public class RunnableExample {


    public static void main(String[] args) {
        int a = 10;
        Runnable runnable = () -> {
//            a=9;
            for(int i=1; i<10; i++){
                System.out.println("Hello" + i);
            }
        }; // Here we are using lambda expression to provide implementation of abstract method "run" from Runnable interface.
        // As Runnable interface is a Functional Interface.

        Thread childThread = new Thread(runnable);
        childThread.start();
    }
}
