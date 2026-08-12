package com.blockingqueue.arrayblockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) {
        ArrayBlockingQueue <Integer> blockingQueue=new ArrayBlockingQueue<>(5);

        Thread1 thread1=new Thread1(blockingQueue);
        Thread2 thread2=new Thread2(blockingQueue);

        thread1.start();
        thread2.start();
    }
}
