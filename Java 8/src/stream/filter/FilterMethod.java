package stream.filter;

import java.util.Arrays;
import java.util.List;

public class FilterMethod {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,20,33,45,8);
        list.stream()
                .filter(i->i%2==0)
                .forEach(i-> System.out.println(i));
    }
}
