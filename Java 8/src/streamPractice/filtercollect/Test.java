package streamPractice.filtercollect;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Sujay", "Amit", "Raj", "Sneha", "Sachin", "Rohit", "Sunil"
        );

        names.stream()
                .filter(s -> s.startsWith("S"))
                .map(name->name.toUpperCase())
                .toList()
                .forEach(System.out::println);
    }
}
