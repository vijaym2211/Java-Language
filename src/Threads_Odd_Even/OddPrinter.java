package Threads_Odd_Even;

public class OddPrinter implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<100; i++){
            if(i%2 == 1){
                System.out.println("Odd thread: " + i);
            }
        }
    }
}