package com.deadlock;

public class Thread1 extends Thread{
    Object obj1;
    Object obj2;

    public Thread1(Object obj1, Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
        System.out.println(this.getName()+" trying to acuired lock on obj1...");
        synchronized (obj1)
        {
            System.out.println(this.getName()+" Lock on obj1");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(this.getName()+" looking for acquire lock on obj2");

            synchronized (obj2){
                System.out.println(this.getName()+" Lock on obj2");
            }
            System.out.println(this.getName()+" has released lock on obj2");
        }
        System.out.println(this.getName()+" release lock on obj1");
    }
}
