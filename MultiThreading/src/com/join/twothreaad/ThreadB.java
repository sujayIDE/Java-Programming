package com.join.twothreaad;

public class ThreadB extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=5;i++)
        {
            System.out.println("B"+i);
        }
    }
}
