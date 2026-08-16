package wildCard;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildCard {
    public static void print(List<? extends Number>list)
    {
        for(Object object:list)
        {
            System.out.println(object);
        }
    }
    public static void main(String[] args) {
        ArrayList<Number> list=new ArrayList<>();
        list.add(10);
        list.add(20.4);
        print(list);
    }
}
