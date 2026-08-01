package com.join;

public class Main {
    public static void main(String[] args) {
        MyThread1 myThread1=new MyThread1();
        Mythread2 mythread2=new Mythread2();

        myThread1.setThread2(mythread2);
        myThread1.start();
        mythread2.start();
    }
}
