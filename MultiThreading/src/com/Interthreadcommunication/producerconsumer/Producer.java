package com.Interthreadcommunication.producerconsumer;

public class Producer extends Thread{
    Buffer  buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for(int i=1;i<=10;i++)
        {
            try {
                Thread.sleep(2000);
                buffer.producer(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
