package com.threadlocal;

//With ThreadLocal object

class MyThread1 extends Thread{
    ThreadLocal threadLocal;

    public MyThread1(ThreadLocal threadLocal) {
        this.threadLocal = threadLocal;
    }

    @Override
    public void run() {
        for(int i=1;i<=5;i++)
        {
            threadLocal.set(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread1 value from threadlocal is: "+threadLocal.get());
        }
    }
}

class MyThread2 extends Thread{
    ThreadLocal threadLocal;

    public MyThread2(ThreadLocal threadLocal) {
        this.threadLocal = threadLocal;
    }

    @Override
    public void run() {
        for(int i=101;i<=105;i++)
        {
            threadLocal.set(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread 2 value from threadlocal is: "+threadLocal.get());
        }
    }
}
public class Main {
    public static void main(String[] args) {
        ThreadLocal<Integer> threadLocal=ThreadLocal.withInitial(()-> 0);

        MyThread1 myThread1=new MyThread1(threadLocal);
        MyThread2 myThread2=new MyThread2(threadLocal);

        myThread1.start();
        myThread2.start();
        
    }
}
