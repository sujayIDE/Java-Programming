package optional;

import java.util.Optional;

public class OptionalMethods {
    public static void main(String[] args) {
        Optional<String> optional=Optional.of("Hello");

        //isPresent()
        System.out.println("isPresent : "+optional.isPresent());

        //get()
        if(optional.isPresent())
        {
            System.out.println("get : "+optional.get());
        }

        //ifPresent(Consumer<T> consumer)
        optional.ifPresent(value-> System.out.println("ifPresent : "+value));

        //orElse(T another)
        Optional<String> optional1=Optional.of("Hello");
        String result=optional1.orElse("Bye");
        System.out.println(result);
           //if optional is empty
        Optional<String> optional2=Optional.empty();
        String result1=optional2.orElse("Bye");
        System.out.println(result1);

        //orElseThrow()
        Optional<String> optional3=Optional.ofNullable("Sujay");
        String result2=optional3.orElseThrow();
        System.out.println(result2);

        //orElseGet(Supplier<T> supplier)
        Optional<String> optional4=Optional.empty();
        String result3=optional4.orElseGet(()->"World");
        System.out.println(result3);

        //filter(Predicate<T> predicate)
        Optional<String> optional5=Optional.of("India");
        Optional<String> optional6 = optional5.filter(str -> str.startsWith("I"));
        System.out.println(optional6);
    }
}
