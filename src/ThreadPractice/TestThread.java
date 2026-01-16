package ThreadPractice;

import java.util.Collection;

public class TestThread extends Thread{

    private int count = 0;
    public static void main(String[] args) {

        System.out.println("This is a thread itself");

        TestThread th = new TestThread();
        Thread t = new Thread(th);
        t.start();
        Thread t2 = new Thread(th);
        t2.start();

    }

    @Override
    public void run() {
        count++;
        System.out.println("This code will be executed in a separate thread");
        System.out.println(Thread.currentThread().getName() + count);
    }
}
