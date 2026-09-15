package shrinivassir.functionalinterface.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(3,4,6,8,9,3,4,4);

        //using  functional interface
        Predicate<Integer> isEven=n->n%2==0;
        Consumer<Integer> c=n-> System.out.println(n*n);

        nums.stream().filter(isEven).forEach(c);

        //using stream
        nums.stream()
                .filter(i->i%2==0)
                .map(i->i*i)
                .forEach(System.out::println);
    }
}
