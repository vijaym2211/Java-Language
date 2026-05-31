package mutex_synchronized.With_Lambda;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Count{
    int num;
    Lock lock;
}
public class Main {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Try programiz.pro");
        Count count = new Count();
        count.lock = new ReentrantLock(); // Initialize the lock

        Runnable adder = () -> {
            for(int i=0; i<10; i++){
                count.lock.lock();
//                synchronized(count){
                    count.num++;
//                }
                count.lock.unlock();
            }
        };
        Runnable subtract = () ->{
            for(int i=0; i<10; i++){
                count.lock.lock();
//                synchronized(count){
                    count.num--;
//                }
                count.lock.unlock();
            }
        };

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtract);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count.num);
    }
}
