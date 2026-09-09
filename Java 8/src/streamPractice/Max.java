package streamPractice;

import java.util.List;
import java.util.OptionalInt;

public class Max {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30);
        numbers.stream()
                .mapToInt(Integer::intValue)
                .max();

    }
}
