package streamPractice.countfilter;

import java.util.Arrays;
import java.util.List;

public class Count {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(
                10, 25, 30, 45, 50, 60, 75, 80
        );

        long count = numbers.stream()
                .filter(num -> num % 5 == 0 && num > 40)
                .count();
        System.out.println(count);
    }
}
