package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        /* I have an array of some numbers.
        I want to do some operations like this:
        1. Remove all the odd numbers -> O(N)
        2. Square the remaining numbers -> O(N)
        3. Sort the array -> O(NlogN)
        4. Remove duplicates -> O(N)
        5. Print the final values -> O(N)
         */

        List<Integer> list = Arrays.asList(20, 33, 1, 5, 78, 55, 20, 4, 8, 4, 70);
        Set<Integer> set = new HashSet<>();
        for(int n: list){
            if(n%2==0){
                int sq = n*n;
                set.add(sq);
            }
        }
        List<Integer> modified = new ArrayList<>(set);
        Collections.sort(modified);

        for(int n: modified){
            System.out.println(n);
        }
        System.out.println("**********************");
        Stream<Integer> s = list.stream()
                .filter(n->{
                    boolean b = n%2==0;
                    if(n>100){
                        b = !b;
                    }
                    return b;
                })
                .map(n->n*n);
        s.sorted()
                .distinct()
                .forEach(n-> System.out.println(n));

        List<String> names = Arrays.asList("Bhavik", "Aditi", "Satish", "Vishal", "Shubham");
        /*
        Count # of letters in each string, square it and sort it and create a new array
         */
        System.out.println("***************************");
        List<Integer> l = names.stream()
                .map(n -> n.length())
                .map(n-> n*n)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(l);

        //Worksheet
        //Find below a list of integers. Iterate over it and print the square of each number.
        List<Integer> n1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        n1.stream().forEach(n -> System.out.println(n));

        //Find below a list of integers. Iterate over it and print every even number.
        n1.stream()
                .filter(a -> a%2==0)
                .forEach(n -> System.out.println(n));

        System.out.println("**********************");
        //For a list of strings, filter out the strings which do not start with the letter T and then uppercase the remaining strings.
        List<String> n2 = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        n2.stream()
                .filter(n-> !n.startsWith("T"))
                .map(n-> n.toUpperCase())
                .forEach(n-> System.out.println(n));

    }
}