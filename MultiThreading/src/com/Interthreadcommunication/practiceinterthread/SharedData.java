package com.Interthreadcommunication.practiceinterthread;

public class SharedData {
    private int value;
    private boolean available=false;


    public SharedData(int value, boolean available) {
        this.value = value;
        this.available = available;
    }

   synchronized void produce(int uservalue)  {
        while (value>10)
        {
            System.out.println("produce value..");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        value=uservalue+1;
        System.out.println(value);
        notify();
    }

    synchronized void consume()  {
        while (value<=0)
        {
            System.out.println("Consume value...");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        value=value-1;
        System.out.println(value);
        notify();
    }
}
