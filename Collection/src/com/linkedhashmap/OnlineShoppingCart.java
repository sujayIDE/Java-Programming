package com.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OnlineShoppingCart {
    public static void main(String[] args) {
        Map<Integer,String> onlineShoppingcart=new LinkedHashMap<>();

        onlineShoppingcart.put(101,"Keyboard");
        onlineShoppingcart.put(102,"Laptop");
        onlineShoppingcart.put(103,"Mobile");
        onlineShoppingcart.put(104,"TV");
        onlineShoppingcart.put(105,"Camera");

        //Remove a product using its ID.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ID : ");
        int id=sc.nextInt();

        System.out.println(onlineShoppingcart.remove(id));
        System.out.println();
        for(Map.Entry<Integer,String> entry:onlineShoppingcart.entrySet())
        {
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }

        System.out.println();
        //Search for a product using its ID.
        System.out.println("Enter id to search : ");
        int id1=sc.nextInt();
        System.out.println(onlineShoppingcart.get(id1));
    }
}
