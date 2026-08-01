package com.Interthreadcommunication.produceconsumerpractice;

public class SharedData {
    private int value;
    private boolean available=false;


    public SharedData(int value, boolean available) {
        this.value = value;
        this.available = available;
    }

    synchronized void produce(int uservalue) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        value = uservalue;
        System.out.println("Produced : " + value);

        available = true;
        notifyAll();
    }

    synchronized void consume() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Consumed : " + value);

        available = false;
        notifyAll();

    }
}
