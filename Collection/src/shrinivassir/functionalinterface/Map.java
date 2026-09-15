package shrinivassir.functionalinterface;

import java.util.*;

public class Map {
    public static void main(String[] args) {
        HashMap<Integer,String> integerStringMap=new HashMap<>();
        integerStringMap.put(10,"Ten");
        integerStringMap.put(20,"Twenty");
        integerStringMap.put(30,"Thirty");

        LinkedHashMap<Integer,String> integerStringLinkedHashMap=new LinkedHashMap<>();
        integerStringLinkedHashMap.put(10,"Ten");
        integerStringLinkedHashMap.put(20,"twenty");
        integerStringLinkedHashMap.put(30,"thirty");

        TreeMap<Integer,String> integers=new TreeMap<>();
        integers.put(10,"ten");
        integers.put(20,"twenty");
        

    }
}
