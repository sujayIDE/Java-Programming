package com.map;

import java.util.*;

public class MapMethods {
    public static void main(String[] args) {
        Map<Integer,String> stringMap=new HashMap<>();
        //Put
        stringMap.put(1,"Sujay");
        stringMap.put(2,"Ajay");
        stringMap.put(3,"Rajesh");
        stringMap.put(4,"Rohit");
        stringMap.put(5,"Kumar");
        stringMap.put(3,"Mahesh");

        //display
        for(Map.Entry<Integer,String>  stringEntry:stringMap.entrySet())
        {
            System.out.println(stringEntry.getKey()+"->"+stringEntry.getValue());
        }

        System.out.println("==========================================================");
        //get(key)
        System.out.println(stringMap.get(4));

        System.out.println("===============================================================");
        //remove(key)
        System.out.println("Remove : "+stringMap.remove(3));

        System.out.println("=====================================================");
        //replace(key,value)
        System.out.println(stringMap.replace(4,"Sujay"));
        System.out.println("---------------");
        for(Map.Entry<Integer,String>  stringEntry:stringMap.entrySet())
        {
            System.out.println(stringEntry.getKey()+"->"+stringEntry.getValue());
        }

        System.out.println("=================================");
        //contains(key)
        System.out.println(stringMap.containsKey(1));
        //contains(value)
        System.out.println(stringMap.containsValue("Sujay"));

        System.out.println("==================================");
        //keySet()
        Set<Integer> integerStringSet=stringMap.keySet();
        for(int i:integerStringSet)
        {
            System.out.println(i);
        }

        System.out.println("=================================");
        //values()
        Collection<String> stringCollections=stringMap.values();
        for(String names:stringCollections)
        {
            System.out.println(names);
        }

        System.out.println("==================================");
        //entrySet()
        Set<Map.Entry<Integer,String>> entries=stringMap.entrySet();
        for(Map.Entry<Integer,String> es:entries)
        {
            System.out.println(es.getKey()+"->"+es.getValue());
        }

        System.out.println("=====================================");
        //size()
        System.out.println(stringMap.size());

        System.out.println("=====================================");
        //clear()
       stringMap.clear();
        System.out.println("=====================================");

        //isEmpty()
        System.out.println(stringMap.isEmpty());
    }
}
