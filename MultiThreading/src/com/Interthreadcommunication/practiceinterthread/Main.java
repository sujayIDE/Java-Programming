package com.Interthreadcommunication.practiceinterthread;

public class Main {
    public static void main(String[] args) {
        SharedData sharedData=new SharedData(0,false);

        Producer producer=new Producer(sharedData);
        Consumer consumer=new Consumer(sharedData);

        producer.start();
        consumer.start();
    }
}
