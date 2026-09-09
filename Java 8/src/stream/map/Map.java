package stream.map;

import java.util.List;

public class Map {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        numbers.stream()
                .map(i->i*i)
                .forEach(System.out::println);
    }
}
