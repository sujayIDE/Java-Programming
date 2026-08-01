package com.threadlocal;

//Example without threadlocal
class A{
    ThreadLocal <Integer> x=ThreadLocal.withInitial(()->0);
}

class Thread1 extends Thread{
    A a;

    public Thread1(A a) {
        this.a = a;
    }

    @Override
    public void run() {
        for(int i=1;i<=5;i++)
        {
            a.x.set(i);
            System.out.println("Thread1 get "+a.x.get());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Thread2 extends Thread{
    A a;

    public Thread2(A a) {
        this.a = a;
    }

    @Override
    public void run() {
        for(int i=1;i<=5;i++)
        {
            a.x.set(i+100);
            System.out.println("Thread2 get "+a.x.get());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Test {
    public static void main(String[] args) {
        A a=new A();
        Thread1 thread1=new Thread1(a);
        Thread2 thread2=new Thread2(a);

        thread1.start();
        thread2.start();
    }
}