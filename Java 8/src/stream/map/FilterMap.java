package stream.map;

import java.util.List;

public class FilterMap {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 10, 15, 20, 25, 30);
        numbers.stream()
                .filter(i->i>15)
                .map(i->i*i)
                .forEach(System.out::println);
    }
}
