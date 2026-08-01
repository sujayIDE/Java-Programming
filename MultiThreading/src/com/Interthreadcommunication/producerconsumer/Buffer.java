package com.Interthreadcommunication.producerconsumer;

import java.util.ArrayList;
import java.util.List;

public class Buffer {
    private List<Integer> buffer=new ArrayList<>();
    private int capacity;

    public Buffer( int capacity) {
        this.capacity = capacity;
    }

    public synchronized void producer(int value) throws InterruptedException {
        while(buffer.size()==capacity)
        {
            System.out.println("Buffer is full..Producer is waiting");
            wait();
        }
        buffer.add(value);
        System.out.println("Producer has put: "+value+" Buffer size: "+buffer.size() );
        notifyAll();
    }

    public synchronized void consumer() throws InterruptedException {
        while(buffer.isEmpty())
        {
            System.out.println("Consumer is empty...consumer is waiting");
            wait();
        }

        int x=buffer.remove(0);
        System.out.println("Consumer has recieved: "+x+" Buffer size: "+buffer.size());
        notifyAll();
    }


}
