package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapUsingIterator {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Sujay");
        map.put(2,"Kumar");

        Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
        while (itr.hasNext())
        {
            Map.Entry<Integer,String> entry=itr.next();
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }


    }
}
