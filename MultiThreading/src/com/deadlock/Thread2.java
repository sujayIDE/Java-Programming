package com.deadlock;

public class Thread2 extends Thread{
    Object obj1;
    Object obj2;

    public Thread2(Object obj1, Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
        System.out.println(this.getName()+ " Trying to acquire lock on obj2...");
        synchronized (obj2)
        {
            System.out.println(this.getName()+" acquire lock on obj2");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(this.getName()+" trying to acquire lock on obj1");
            synchronized (obj1)
            {
                System.out.println(this.getName()+" acquire lock on obj1");
            }
            System.out.println(this.getName()+" released lock on obj1");
        }
        System.out.println(this.getName()+" release lock on obj2En");
    }
}
