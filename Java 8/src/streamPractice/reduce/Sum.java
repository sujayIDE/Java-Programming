package streamPractice.reduce;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        int sum=numbers.stream()
                .reduce(0,(a,b)->a+b);
        System.out.println(sum);
    }
}
