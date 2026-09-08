package shrinivassir;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(3,7,2,9,4,8,5);

        nums.stream()
                .map(i->i*i)
                .forEach(System.out::println);
        System.out.println();
        nums.stream()
                .filter(i->i%2==0)
                .forEach(System.out::println);

        System.out.println();

        int sum=nums.stream()
                .reduce(0,(a,b)->a+b);
        System.out.println(sum);
    }
}
