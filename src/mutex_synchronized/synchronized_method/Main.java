package mutex_synchronized.synchronized_method;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count count =  new Count();

        Adder adder = new Adder(count);
        Subtractor subtractor =  new Subtractor(count);

        Thread t1= new Thread(adder);
        Thread t2= new Thread(subtractor);

        t1.start(); // Start thread 1
        t2.start(); // Start thread 2

        t1.join(); // Main Thread (MT) waits for t1 to complete
        t2.join(); // Main Thread (MT) waits for t2 to complete

        System.out.println("Final value:" + count.num);
    }
}
