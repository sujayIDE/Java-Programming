package streamPractice.filtermapsort;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 25, 30, 15, 40, 55, 20, 35);
        numbers.stream()
                .filter(i->i>20)
                .map(i->i*2)
                .sorted((a,b)->Integer.compare(b,a))
                .forEach(System.out::println);
    }
}
