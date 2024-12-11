package LLD_Design_Pattern.Builder.Non_Static_Inner_Class;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
    }
}