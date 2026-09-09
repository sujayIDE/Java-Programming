package stream.filter;

import java.util.List;
import java.util.stream.Stream;

public class Filter {
    public static void main(String[] args) {
        List<Integer> list=List.of(10, 15, 20, 25, 30, 35, 40);
        System.out.println("Numbers greater than 20");
        list.stream()
                .filter(i->i>20)
                .forEach(System.out::println);

        System.out.println("===========================================================");
        System.out.println("Using Stream filter(), print only names whose length is greater than 4.");
        List<String> names = List.of("Sujay", "Amit", "Raj", "Suresh", "Anil", "Sachin");
        names.stream()
                .filter(i->(i.length())>4)
                .forEach(System.out::println);
    }
}
