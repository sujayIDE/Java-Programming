package stream.map;

import java.util.List;

public class ConvertStringInUpperCase {
    public static void main(String[] args) {
        List<String> names = List.of("Sujay", "Amit", "Raj", "Suresh");
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
