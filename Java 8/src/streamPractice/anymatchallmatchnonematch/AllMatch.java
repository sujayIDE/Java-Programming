package streamPractice.anymatchallmatchnonematch;

import java.util.Arrays;
import java.util.List;

public class AllMatch {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        boolean b = numbers.stream()
                .allMatch(num -> num > 5);
        System.out.println(b);
    }
}
