package wildCard;

import java.util.ArrayList;
import java.util.List;

public class LoweBoundWildCard {
    static void print(List<? super Integer>list)
    {
        for(Object object:list)
        {
            System.out.println(object);
        }
    }
    public static void main(String[] args) {
        ArrayList<Number> list=new ArrayList<>();
        list.add(10.0);
        list.add(20);
         print(list);
    }
}
