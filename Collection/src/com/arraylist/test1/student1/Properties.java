package com.arraylist.test1.student1;

import java.util.ArrayList;
import java.util.List;

public class Properties {
    public static void main(String[] args) {
        List<String> fruits=new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");

        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.contains("Apple"));
        fruits.clear();
        System.out.println(fruits.isEmpty());
    }
}
