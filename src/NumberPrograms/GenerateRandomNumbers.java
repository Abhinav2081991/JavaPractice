package NumberPrograms;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomNumbers {

    public static void main(String[] args) {

        Random r =  new Random();
        System.out.println("Random Number is: " + r.nextInt());
        System.out.println("Random Number is: " + r.nextInt(100));

        double rand = Math.random();
        System.out.println("Random double: " + rand);

        // Random integer between 0 and 99
        int randInt = ThreadLocalRandom.current().nextInt(0, 100);
        System.out.println("Random int (0-99): " + randInt);

        // Random double between 0.0 and 1.0
        double randDouble = ThreadLocalRandom.current().nextDouble();
        System.out.println("Random double: " + randDouble);

        //  Fibonacci Series.
        int a = 0;
        int b = 1;
        int c = 1;

        for(int i=0; i<=10; i++){
            System.out.println(a);
            a=b;
            b=c;
            c = a+b;
        }



    }
}
