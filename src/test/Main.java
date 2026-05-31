package test;

import java.util.ArrayList;
import java.util.List;
import java.util.*;


class Employee {
    String name;
    int age;
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("vijay", 12));
        list.add(new Employee("ajdh", 9));
        list.add(new Employee("jay", 14));

        list.sort(Comparator.comparing((Employee e) -> e.name).thenComparing(e -> e.age));

        System.out.println(list);






    }
}
