package Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;


public class ThreadPool {
    public static void main(String[] args) {
        NumberPrinter np = new NumberPrinter();
        ExecutorService es = Executors.newFixedThreadPool(2); //Create the Thread pool
        for(int i=0; i<5; i++){
            es.execute(np);
        }
        es.shutdown(); //used to gracefully shut down an ExecutorService in Java.
    }
}
