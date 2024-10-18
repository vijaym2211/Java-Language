package Callable;

import java.util.Random;
import java.util.concurrent.Callable;

public class RandomNumberGenerator implements Callable {

    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        System.out.println("In thread, starting to generate random number");
        int n = random.nextInt();
        Thread.sleep(1000 * 10); //static method in Java that pauses
                                       // the execution of the current thread for a specified amount of time.
        System.out.println("Random number has been generated, it is " + n);
        return n;
    }
}
