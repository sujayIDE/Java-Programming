package streamPractice.maxmin;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Maximum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(45, 12, 78, 34, 89, 23);
        Optional<Integer> max = numbers.stream()
                .max(Integer::compareTo);
        System.out.println(max.get());

        Optional<Integer> min = numbers.stream()
                .min(Integer::compareTo);
        System.out.println(min.get());
    }
}
