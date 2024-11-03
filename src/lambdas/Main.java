package lambdas;

public class Main {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am in a thread");
            }
        };

        Runnable r1 = () -> System.out.println("I am in a thread");

        /*
        (a,b) -> {
         //body lambda
        }
         */
        A a = num -> System.out.println("I am inside show, this is num:" + num);
        a.show(10);

        B b = (n,m) -> {
            System.out.println(n);
            System.out.println(m);
        };
        b.show(10, 50);

    }
}

@FunctionalInterface
interface A{
    void show(int n);
}

interface B{
    void show(int a, int b);
}