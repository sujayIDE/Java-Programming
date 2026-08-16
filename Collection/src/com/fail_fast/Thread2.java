package com.fail_fast;

import java.util.ArrayList;

public class Thread2 extends Thread{
    ArrayList<Integer> integerArrayList;

    public Thread2(ArrayList<Integer> integerArrayList) {
        this.integerArrayList = integerArrayList;
    }

    @Override
    public void run() {
        for(int i=5;i<=8;i++)
        {
            integerArrayList.add(i);
            System.out.println("Thread 2 Add : "+i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
