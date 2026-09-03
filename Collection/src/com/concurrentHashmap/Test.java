package com.concurrentHashmap;

import com.fail_fast.Thread2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> integerArrayList=new ArrayList<>();

        Thread thread1=new Thread(()->{
            for(int i=1;i<=10;i++)
            {
                integerArrayList.add(i);
                System.out.println(i+" added by thread 1");
            }
        });

        Thread thread2=new Thread(()->{
            for(int i=1;i<=10;i++)
            {
                integerArrayList.add(i);
                System.out.println(i+" added by Thread 2");
            }
        });

        thread1.start();
        thread2.start();

      /*  thread1.join();
        thread2.join();*/

        Thread.sleep(2000);

        for(Integer i:integerArrayList)
        {
            integerArrayList.add(50);
            System.out.println("Arraylist Modified");
        }
    }
}
