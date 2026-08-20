package stream.flatMap;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> list= Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4),
                Arrays.asList(5,6,7),
                Arrays.asList(8)
        );

        List<Integer> allNumber=list.stream()
                .flatMap(c->c.stream())
                .toList();
        System.out.println(allNumber);
    }
}
