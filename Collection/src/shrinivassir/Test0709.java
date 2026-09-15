package shrinivassir;

import java.util.Arrays;
import java.util.List;

public class Test0709 {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(3,7,2,9,4,8,5);

        //squares
        nums.stream()
                .map(i->i*i)
                .forEach(System.out::println);

        System.out.println();

        //even number
        nums.stream()
                .filter(i->i%2==0)
                .forEach(System.out::println);

        System.out.println();

        //sum of numbers
        int sum=nums.stream()
                .reduce(0,(a,b)->a+b);
        System.out.println(sum);

        System.out.println();

        //sum of squares
        int sumOfSquares=nums.stream()
                .filter(i->i%2==0)
                .map(i->i*i)
                .reduce(0,(a,b)->a+b);

        System.out.println(sumOfSquares);
    }
}
