package streamPractice.filter;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(15, 20, 25, 30, 35, 40);
        Optional<Integer> first = numbers.stream()
                .filter(num -> num > 25)
                .findFirst();
        first.ifPresent(System.out::println);
    }
}
