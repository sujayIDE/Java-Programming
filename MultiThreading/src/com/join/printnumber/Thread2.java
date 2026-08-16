package com.join.printnumber;

public class Thread2 extends Thread{
    @Override
    public void run() {
        for(int j=6;j<=10;j++)
        {
            System.out.println("j = "+j);
        }
    }
}
