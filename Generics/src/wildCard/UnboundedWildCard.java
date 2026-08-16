package wildCard;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildCard {
    public static void print(List<?> list)
    {
        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
    public static void main(String[] args) {
       ArrayList<Integer> integerArrayList=new ArrayList<>();
       integerArrayList.add(10);
       integerArrayList.add(20);

        print(integerArrayList);
    }
}
