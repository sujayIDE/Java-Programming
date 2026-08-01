package com.synchronizedblock.count;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count count=new Count();

        Thread1 thread1=new Thread1(count);
        Thread2 thread2=new Thread2(count);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final count: "+count.count);
    }
}
