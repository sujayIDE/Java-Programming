package streamPractice.anymatch;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 35, 40, 50);
        boolean b = numbers.stream()
                .anyMatch(num -> num > 40);
        System.out.println(b);
    }
}
