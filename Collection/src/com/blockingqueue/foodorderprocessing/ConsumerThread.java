package com.blockingqueue.foodorderprocessing;

import java.util.concurrent.BlockingQueue;

public class ConsumerThread extends Thread {
    BlockingQueue<Order> orders;

    public ConsumerThread(BlockingQueue<Order> orders) {
        this.orders = orders;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Order order = orders.take();
                Thread.sleep(10000);
                System.out.println("Processing order: " + order);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
