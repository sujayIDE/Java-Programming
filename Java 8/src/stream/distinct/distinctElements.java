package stream.distinct;

import java.util.List;

public class distinctElements {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 10, 30, 20, 40, 30, 50);
        numbers.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
