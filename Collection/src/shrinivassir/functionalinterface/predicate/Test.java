package shrinivassir.functionalinterface.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
//        Predicate<Integer> isEven=i->i%2==0;
//        System.out.println("4 is even : "+isEven.test(4));
//        System.out.println("3 is even : "+isEven.test(3));

        List<Integer> integers= Arrays.asList(3,7,8,9,4,2);
        Predicate<Integer> isEven=i->i%2==0;
        for(int ele:integers)
        {
            if(isEven.test(ele))
            {
                System.out.println(ele);
            }
        }

        System.out.println();
        integers.stream()
                .filter(isEven)
                .forEach(System.out::println);


    }
}
