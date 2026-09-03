package com.blockingqueue.foodorderprocessing;

import java.util.Scanner;
import java.util.concurrent.BlockingQueue;

public class ProducerThread extends Thread{
    BlockingQueue<Order> orders;

    public ProducerThread(BlockingQueue<Order> orders) {
        this.orders = orders;
    }

    Scanner scanner=new Scanner(System.in);
    @Override
    public void run() {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Enter Order ID");
            int orderId= scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter Customer Name");
            String customerName= scanner.nextLine();

            System.out.println("Enter Food Item");
            String foodItem= scanner.nextLine();

            try {
                Order order=new Order(orderId,customerName,foodItem);
                orders.put(order);
                System.out.println("Order added : "+order);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
