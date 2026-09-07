package shrinivassir;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums =Arrays.asList(3,7,2,9,4,6,5,8);

        nums.stream()
                .map(n->n*n)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Even numbers :");
        nums.stream()
                .filter(i->i%2==0)
                .forEach(System.out::println);
    }
}
