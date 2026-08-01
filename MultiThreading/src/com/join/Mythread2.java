package com.join;

public class Mythread2 extends Thread{

    @Override
    public void run() {
        for(int j=11;j<=20;j++)
        {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("j = "+j);
        }
    }
}
