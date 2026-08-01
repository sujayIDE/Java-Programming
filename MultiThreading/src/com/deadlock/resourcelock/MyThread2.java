package com.deadlock.resourcelock;

public class MyThread2 extends Thread{
    ResourceA resourceA;
    ResourceB resourceB;

    public MyThread2(ResourceA resourceA, ResourceB resourceB) {
        this.resourceA = resourceA;
        this.resourceB = resourceB;
    }

    @Override
    public void run() {
        synchronized (resourceB)
        {
            System.out.println(this.getName()+" ResourceB get lock.....");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(this.getName()+" ResourceB wait for lock on ResourceA");
            synchronized (resourceA)
            {
                System.out.println(this.getName()+" ResourceB waiting for lock......");
            }
        }
    }
}

