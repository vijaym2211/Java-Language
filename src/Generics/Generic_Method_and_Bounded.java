package Generics;

public class Generic_Method_and_Bounded {
    public static void main(String[] args) {
        printData("Hello");
        printData(123);

        Generic_Method_and_Bounded obj= new Generic_Method_and_Bounded(); //for non static method we created object
//        obj.doubleData("abc");
        obj.doubleData(123);
    }

    static <E> void printData(E data){
        System.out.println(data);
    }

    <E extends Number> void doubleData(E data){
        System.out.println(data);
    }

}
