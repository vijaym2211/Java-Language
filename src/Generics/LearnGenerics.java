package Generics;

import java.sql.Array;
import java.util.ArrayList;

public class LearnGenerics {
    public static void main(String[] args) {
        Dog<String> d1 = new Dog("djbvcb k");
        System.out.println(d1.getID());

        Dog<String> d2 = new Dog<>("bsvhbhv");
        System.out.println(d2.getID());

        Dog<Integer> d3 = new Dog<>(12);

        System.out.println(d3.getID());

//        ArrayList<Integer> ans = new ArrayList<>();
    }
}

class Dog<E>{
    E id;
    public Dog(E id){
        this.id = id;
    }
    E getID(){
        return id;
    }
}