package parallelStream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        long a=System.currentTimeMillis();
        Stream<Integer> integerStream =
                IntStream.rangeClosed(1, 10000)
                                .filter(i->i%2==0)
                                        .boxed();
        integerStream.forEach(System.out::println);
        long b=System.currentTimeMillis();
        System.out.println("Stream taken : "+(b-a));

        System.out.println("=================================================");

        long x=System.currentTimeMillis();
        Stream<Integer> integerStream1=
                IntStream.rangeClosed(1, 10000)
                        .filter(i->i%2==0)
                        .boxed().parallel();
        integerStream1.forEach(System.out::println);
        long y=System.currentTimeMillis();
        System.out.println("ParallelStream taken : "+(y-x));
    }
}
