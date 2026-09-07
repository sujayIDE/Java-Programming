package shrinivassir;

import java.util.Arrays;
import java.util.List;

public class StringClass {
    public static void main(String[] args) {
        List<String> strings= Arrays.asList("Go","Java","Python","Android","SQL");

        strings.stream()
                .map(l->l.length())
                .forEach(System.out::println);

        System.out.println();
        strings.stream()
                .filter(s->s.startsWith("A"))
                .forEach(System.out::println);
    }
}
