package com.join.basicmainthread;

public class Main {
    public static void main(String[] args) {
        Mythread mythread=new Mythread();
        mythread.start();
        try {
            mythread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main Thread Finish...");
    }
}
