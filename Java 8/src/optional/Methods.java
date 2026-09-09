package optional;

import java.util.Optional;

public class Methods {
    public static void main(String[] args) {
        Optional<String> optional=Optional.of("hello");
       //isPresent()
        System.out.println(optional.isPresent());

        System.out.println("=====================================");
        //get
        System.out.println(optional.get());
        System.out.println("======================================");

        // ifPresent()
        optional.ifPresent(i-> System.out.println(i));
        System.out.println("======================================");

        //orElse()
        String hello = optional.orElse("World");
        System.out.println(hello);
        System.out.println("=======================================");

        //orElseThrow()
        System.out.println(optional.orElseThrow());
        System.out.println("======================================");

        //orElseGet()
        Optional<String> optional1=Optional.empty();
        String name = optional1.orElseGet(()->"Sujay");
        System.out.println(name);
        System.out.println("========================================");

        //filter(Predicate<T> predicate)
        Optional<String> optional2=Optional.of("Pratik");
        Optional<String> condition = optional2.filter(str -> str.startsWith("P"));
        System.out.println(condition);


    }
}
