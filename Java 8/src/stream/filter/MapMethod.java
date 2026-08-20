package stream.filter;

import java.util.Arrays;
import java.util.List;

public class MapMethod {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(4,6,9,1,3);
        list.stream()
                .map(i->i*i)
                .forEach(i-> System.out.println(i));
    }
}
