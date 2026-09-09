package stream.skip;

import java.util.List;

public class SkipDemo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50, 60, 70);
        System.out.println("Using Stream, skip the first 3 elements and print the remaining elements.");
        numbers.stream()
                .skip(3)
                .forEach(System.out::println);
    }
}
