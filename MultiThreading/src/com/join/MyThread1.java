package com.join;

public class MyThread1 extends Thread{

    Mythread2 thread2;

    public void setThread2(Mythread2 thread2) {
        this.thread2 = thread2;
    }
    @Override
    public void run() {
        for(int i=1;i<=10;i++)
        {
           try{
               Thread.sleep(2000);
               System.out.println("i = "+i);
               if(i==5)
               {
                   thread2.join();
               }
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
        }
    }
}
