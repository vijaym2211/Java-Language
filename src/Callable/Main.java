package Callable;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService es = Executors.newFixedThreadPool(1);

        RandomNumberGenerator rng = new RandomNumberGenerator();
        Future<Integer> fi = es.submit(rng); //used when Java when working with the ExecutorService to submit a task for execution.
        System.out.println("Manager is doing his own task");
//        int randomNumber = fi.get();
        int randomNumber = fi.get(5, TimeUnit.SECONDS);
        System.out.println("From main RN:" + randomNumber);
        es.shutdown();
    }
}
