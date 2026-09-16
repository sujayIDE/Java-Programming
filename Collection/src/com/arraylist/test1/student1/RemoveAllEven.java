package com.arraylist.test1.student1;

import java.util.ArrayList;
import java.util.List;

public class RemoveAllEven {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        list.removeIf(n->n%2==0);

        System.out.println(list);

    }
}
