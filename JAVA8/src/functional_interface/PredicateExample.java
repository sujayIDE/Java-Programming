package predicate;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> predicate=n-> n%2==0;
        if(predicate.test(20))
        {
            System.out.println("even");
        }else {
            System.out.println("odd");
        }

        Function<Integer,Integer> function=n->n*n;
        Integer apply = function.apply(5);
        System.out.println(apply);

        Consumer<String> stringConsumer=System.out::println;
        stringConsumer.accept("Sujay");

        Supplier<Integer> supplier=()-> 100;
        System.out.println(supplier.get());

    }
}
