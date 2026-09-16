package com.arraylist.test1.student1;

import java.util.ArrayList;
import java.util.List;

public class IndexBased {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list.get(2));

        list.set(1,99);

        System.out.println(list);

        list.remove(3);
        System.out.println(list);
    }
}
