package Processes_and_Threads;

public class BasicThreads implements Runnable{
    @Override
    public void run() {
        System.out.println("I am in a new thread, " +
                "name of the thread is " + Thread.currentThread().getName());
    }
}