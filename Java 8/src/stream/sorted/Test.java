package stream.sorted;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(34,10,67,99,24,55);
        /*
 filter even elements of this list,
 square them and then sort the results
 in descending order.
 */

        list.stream()
                .filter(i->i%2==0)
                .map(i->i*i)
                .sorted((a,b)->Integer.compare(b,a))
                .forEach(i-> System.out.println(i));
    }
}
