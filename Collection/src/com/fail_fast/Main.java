package com.fail_fast;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>integerArrayList=new ArrayList<>();
        Thread1 thread1=new Thread1(integerArrayList);
        Thread2 thread2=new Thread2(integerArrayList);

        thread1.start();
        thread2.start();

    }
}
