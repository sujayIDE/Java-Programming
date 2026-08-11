package com;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        integerTreeSet.add(50);
        integerTreeSet.add(20);
        integerTreeSet.add(80);
        integerTreeSet.add(10);

        for(Integer i:integerTreeSet)
        {
            System.out.println(i);
        }

        //remove

        integerTreeSet.remove(20);

        for(Integer i:integerTreeSet)
        {
            System.out.println(i);
        }
    }
}
