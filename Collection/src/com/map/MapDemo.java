package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("ind", "India");
        hashMap.put("aus", "Australia");
        hashMap.put("nz", "Newzeland");
        hashMap.put("nep", "Nepal");
        hashMap.put("us", "America");
        hashMap.put("wi", "Westindies");

        Set<String> keys = hashMap.keySet();
        for(String k:keys)
        {
            System.out.println(k);
        }

        System.out.println("===================================================");
        Collection<String> values = hashMap.values();
        for(String valString:values)
        {
            System.out.println(valString);
        }

        System.out.println("============================================================");
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        for(Map.Entry<String,String > entry:entries)
        {
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
}
