package com.Interthreadcommunication.producerconsumer;

public class Consumer extends Thread{
    Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for(int i=1;i<=10;i++)
        {
            try {
                Thread.sleep(2000);
                buffer.consumer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
