package com.synchronizedblock.count;

public class Thread2 extends Thread{
    Count count;

    public Thread2(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=1;i<=1000;i++)
        {
            count.increment();
            System.out.println("i = "+count.count);
        }
    }
}
