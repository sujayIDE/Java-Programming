package com.deadlock.resourcelock;

public class Mythread1 extends Thread{
    ResourceA resourceA;
    ResourceB resourceB;

    public Mythread1(ResourceA resourceA, ResourceB resourceB) {
        this.resourceA = resourceA;
        this.resourceB = resourceB;
    }

    @Override
    public void run() {
        synchronized (resourceA)
        {
            System.out.println(this.getName()+" ResourceA get lock.....");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(this.getName()+ " ResourceA wait for get lock on ResourceB");
            synchronized (resourceB)
            {
                System.out.println(this.getName()+ " ResourceB waiting....");
            }
        }
    }
}
