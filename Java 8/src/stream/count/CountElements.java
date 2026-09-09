package stream.count;

import java.util.List;

public class CountElements {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 25, 30, 15, 40, 50, 20);
        System.out.println("Using Stream, count how many numbers are greater than 20.");
        long count=numbers.stream()
                .filter(i->i>20)
                .count();
        System.out.println(count);
    }
}
