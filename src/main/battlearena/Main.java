package main.battlearena;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);




        for (Integer number : numbers) {
             if (number > 2) {
                 System.out.println(number);
             }
        }


        /*
        numbers.stream()
                .filter(n -> n > 2)
                .forEach(System.out::println);

         */

    }
}
