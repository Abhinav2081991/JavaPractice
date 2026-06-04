package ThreadPractice;

public class RunnablePractice implements  Runnable{

    @Override
    public void run() {
        System.out.println("This is run method from Runnable interface");
        System.out.println(Thread.currentThread().getName());
    }


    public static void main(String[] args) {
        Runnable runnable = new RunnablePractice();

        Runnable r =   () -> {
            System.out.println("Runnable task: This will run on a separate thread.");
        };
        r.run();

        runnable.run();
        Thread t = new Thread(runnable);
        t.start();
        Thread t1 = new Thread(r);
        t1.start();

    }
}
