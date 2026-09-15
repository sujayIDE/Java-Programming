package shrinivassir;

import java.util.Arrays;
import java.util.List;

public class MaxMin {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(3,5,7,8,9,2,3);
        Integer i = list.stream()
                .min(Integer::compareTo)
                .get();
        System.out.println(i);

        System.out.println();

        Integer reduce = list.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(reduce);

        System.out.println();
        int sum = list.stream()
                .mapToInt(n -> n)
                .sum();
        System.out.println(sum);

        System.out.println();
        double r = list.stream()
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(r);


    }
}
