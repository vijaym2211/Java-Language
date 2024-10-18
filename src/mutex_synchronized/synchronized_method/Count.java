package mutex_synchronized.synchronized_method;

public class Count {
    int num;

    public synchronized void incrementValue() {
        this.num++;
    }
    public synchronized void decrementValue(){
        this.num--;
    }
}
