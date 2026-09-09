package streamPractice.flatmap;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> numbers = Arrays.asList(
                Arrays.asList(10, 20, 30),
                Arrays.asList(40, 50),
                Arrays.asList(60, 70, 80)
        );

        numbers.stream()
                .flatMap(c->c.stream())
                .filter(i->i>30)
                .sorted()
                .forEach(System.out::println);
    }
}
