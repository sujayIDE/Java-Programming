package streamPractice.distinctsortedcollect;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(
                10, 20, 10, 30, 40, 20, 50, 30, 60
        );

        numbers.stream()
                .distinct()
                .sorted((a,b)->Integer.compare(b,a))
                .toList()
                .forEach(System.out::println);
    }
}
