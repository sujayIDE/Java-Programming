package streamPractice;

import java.util.List;
import java.util.OptionalInt;

public class Sum {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);
    }
}
