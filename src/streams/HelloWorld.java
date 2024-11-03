package streams;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//https://github.com/kanmaytacker/fundamentals/blob/2023/august/advanced/advanced-concepts/notes/03-streams-worksheet.md
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // for(int nums : numbers){
        //     System.out.println(nums);
        // }
        // 1. Find below a list of integers. Iterate over it and print the square of each number.
        numbers.stream()
                .map(number -> number*number)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // 2. Find below a list of integers. Iterate over it and print every even number.
        numbers.stream().forEach(number -> {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        });

        System.out.println();

        // 3. For the list of integers, find all the even numbers. Then, iterate over the even numbers and print each number.
        numbers.stream()
                .filter(n -> n%2 == 0)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // 4. For a list of integers, return a list of the squares of each number.
        List<Integer> squares= numbers.stream().map(n -> n*n).collect(Collectors.toList());
        // nums.forEach(n -> System.out.print(n+ " "));
        System.out.println(squares);

        System.out.println();
        List<String> names = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");

        // 5. For a list of strings, return a list of the length of each string.
        List<Integer> str_len= names.stream().map(n -> n.length()).collect(Collectors.toList());
        System.out.println(str_len);

        System.out.println("6.*********************");

        // 6. For a list of strings, filter out the strings which do not start with the letter T and then uppercase the remaining strings.
         List<String> str1= names.stream().filter(n -> !n.startsWith("T")).map(n -> n.toUpperCase()).collect(Collectors.toList());
         System.out.println(str1);


        //   7. For a list of strings, filter out the strings which do not start with the letter T, then uppercase the remaining strings and then sort them.
        List<String> str12= names.stream().filter(n -> !n.startsWith("T")).map(n -> n.toUpperCase()).sorted().collect(Collectors.toList());
        System.out.println(str12);

        //8. For a list of integers, find the sum of all the numbers.
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        // 9. For a list of integers, find the sum of the squares of all the numbers.
        int sq_sum = numbers.stream().map(n -> n*n).reduce(0, (a, b) -> a + b);
        System.out.println(sq_sum);

        // 10.For a list of integers, find the sum of the squares of all the even numbers.
        int sq_even_sum = numbers.stream().filter(n -> n%2==0).map(n -> n*n).reduce(0, (a, b) -> a + b);
        System.out.println(sq_even_sum);

        // 11.Given a list of numbers, find the maximum number in the list.
        Optional<Integer> max = numbers.stream().reduce((number1, number2) -> number1 > number2 ? number1 : number2);
        System.out.println(max);

        // 12. Given a list of numbers with duplicates, find the distinct numbers in the list
        List<Integer> numbers2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5);
        List<Integer> distinct_num= numbers2.stream().distinct().collect(Collectors.toList());
        System.out.println(distinct_num);

        // 13.Given a list of numbers, find the average of all the numbers.
        List<Double> numbers3 = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        Double average = numbers3.stream().reduce(0.0, (a, b) -> a+b) / numbers.size();
        // Double average12 = numbers3.stream().mapToDouble(n -> n).average().getAsDouble();

        System.out.println(average);

        System.out.println("14.*************");
        // 14. Give a list of strings, find the average length of all the strings.
        Double avg_len = names.stream()
                .mapToInt(str -> str.length())
                // .mapToInt(String::length)
                .average()
                .getAsDouble();
        System.out.println(avg_len);

        // 15.Given a list of strings, find strings that is longer than 10 characters.
        List<String> long_str= names.stream().filter(n -> n.length()>10).collect(Collectors.toList());
        System.out.println(long_str);

        // 16.Given a list of strings, find the first string that is longer than 10 characters.
        Optional<String> firstLongName = names.stream().filter(name -> name.length() > 10)
                .findFirst();
        System.out.println(firstLongName);

    }
}