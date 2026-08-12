package com.blockingqueue.arrayblockingqueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Thread2 extends Thread{
    ArrayBlockingQueue<Integer> arrayBlockingQueue;

    public Thread2(ArrayBlockingQueue<Integer> arrayBlockingQueue) {
        this.arrayBlockingQueue = arrayBlockingQueue;
    }

    @Override
    public void run() {
        for(int i=1;i<=10;i++)
        {
            try {
                Integer take=arrayBlockingQueue.take();
                System.out.println("The element is took : "+take);
                Thread.sleep(20000);
            } catch (InterruptedException e) {
            }
        }
    }
}
