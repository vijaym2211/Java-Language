package Processes_and_Threads;

public class Main {
    public static void main(String[] args) {
        BasicThreads basicThread = new BasicThreads();
        Thread thread = new Thread(basicThread);
        thread.start();
        System.out.println("I am in main thread, proof is this " + Thread.currentThread().getName());
    }
}
