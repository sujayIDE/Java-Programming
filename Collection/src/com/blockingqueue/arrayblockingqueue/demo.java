package com.blockingqueue.arrayblockingqueue;

import java.util.concurrent.ArrayBlockingQueue;

public class demo {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> blockingQueue=new ArrayBlockingQueue<>(5);

        Thread thread1=new Thread(()->
        {
            try{
                for(int i=1;i<=10;i++)
                {
                    blockingQueue.put(i);
                    System.out.println("Produced : "+i);
                    Thread.sleep(5000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread thread2=new Thread(()->
        {
           try
           {
               for(int i=1;i<=10;i++)
               {
                   int value=blockingQueue.take();
                   System.out.println("Cosume : "+value);
                   Thread.sleep(2000);
               }
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
        });

        thread1.start();
        thread2.start();
    }
}
