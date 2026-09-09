package streamPractice.distinctsortedcollect;

import java.util.Arrays;
import java.util.List;

public class StringTest {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Sujay", "Amit", "Sujay", "Rahul", "Amit", "Sneha", "Raj"
        );

        names.stream()
                .distinct()
                .filter(name->name.length()>4)
                .map(upper->upper.toUpperCase())
                .sorted()
                .toList()
                .forEach(System.out::println);
    }
}
