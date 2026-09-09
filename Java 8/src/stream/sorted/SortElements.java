package stream.sorted;

import java.util.Comparator;
import java.util.List;

public class SortElements {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(50, 10, 40, 20, 30);
        numbers.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("==============================================");
        System.out.println("Sort element in descending sorting order : ");
        List<Integer> numbers1 = List.of(50, 10, 40, 20, 30);
        numbers1.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
