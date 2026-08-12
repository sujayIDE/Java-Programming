package com.blockingqueue.arrayblockingqueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Thread1 extends Thread{
    ArrayBlockingQueue<Integer> arrayBlockingQueue;

    public Thread1(ArrayBlockingQueue<Integer> arrayBlockingQueue) {
        this.arrayBlockingQueue = arrayBlockingQueue;
    }

    @Override
    public void run() {
        for(int i=1;i<=10;i++)
        {
            try {
                arrayBlockingQueue.put(i);
                System.out.println("The element is put : "+i);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }
    }
}
