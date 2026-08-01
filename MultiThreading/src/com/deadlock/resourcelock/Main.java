package com.deadlock.resourcelock;

public class Main {
    public static void main(String[] args) {
        ResourceA resourceA=new ResourceA();
        ResourceB resourceB=new ResourceB();

        Mythread1 mythread1=new Mythread1(resourceA,resourceB);
        MyThread2 myThread2=new MyThread2(resourceA,resourceB);

        mythread1.start();
        myThread2.start();
    }
}
