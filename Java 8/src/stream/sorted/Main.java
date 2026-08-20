package stream.sorted;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(78,34,90,23,12,34);
        //sort
        /*list.stream()
                .sorted()
                .forEach(i-> System.out.println(i));*/

        list.stream()
                .sorted((i1,i2)->Integer.compare(i2,i1))
                .forEach(i-> System.out.println(i));

    }
}
