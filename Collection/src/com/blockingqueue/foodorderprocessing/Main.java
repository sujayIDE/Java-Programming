package com.blockingqueue.foodorderprocessing;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) {
        BlockingQueue<Order> orders=new ArrayBlockingQueue<>(3);

        ProducerThread producerThread=new ProducerThread(orders);
        ConsumerThread consumerThread=new ConsumerThread(orders);

        producerThread.start();
        consumerThread.start();
    }
}
