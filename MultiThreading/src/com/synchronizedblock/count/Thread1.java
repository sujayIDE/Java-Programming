package com.synchronizedblock.count;

public class Thread1 extends Thread{
    Count count;

    public Thread1(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=1;i<=1000;i++)
        {
            count.increment();
            System.out.println("j = "+count.count);
        }
    }
}
