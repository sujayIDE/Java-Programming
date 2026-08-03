package com.join.twothreaad;

public class ThreadA extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=5;i++)
        {
            System.out.println("A"+i);
        }
    }
}
