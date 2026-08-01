package com.daemon;

public class Mythread2 extends Thread{
    @Override
    public void run() {
        for(int j=11;j<=100;j++)
        {
            System.out.println("j = "+j);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
