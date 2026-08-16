package com.threadlocal.demo;

public class Main {
    static ThreadLocal<Integer> count=ThreadLocal.withInitial(()->0);
    public static void main(String[] args) {
        Thread thread1=new Thread(()->{
            count.set(10);
            System.out.println("Thread1 : "+count.get());
        });

        Thread thread2=new Thread(()->{
            count.set(20);
            System.out.println("Thread2 : "+count.get());
        });

        thread1.start();
        thread2.start();
    }
}
