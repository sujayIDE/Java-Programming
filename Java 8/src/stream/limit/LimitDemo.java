package stream.limit;

import java.util.List;

public class LimitDemo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50, 60, 70);
        System.out.println("Using Stream, print only the first 3 elements.");
        numbers.stream()
                .limit(3)
                .forEach(System.out::println);
    }
}
