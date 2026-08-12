package com.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue <Integer> pq=new PriorityQueue<>();
        pq.add(90);
        pq.add(50);
        pq.add(20);
        pq.add(60);
        pq.add(35);

        //sort only the head
       /* for(Integer i:pq)
        {
            System.out.print(i+" ");
        }*/

        System.out.println("===============================================");
        //I want all elements one by one in sorted order so we use poll()/remove() use while loop
      /*  while (!pq.isEmpty())
        {
            System.out.print(pq.poll()+" ");
        }*/
        System.out.println();
        System.out.println("======================================================");
        //Using iterator
        Iterator<Integer> integerIterator=pq.iterator();
        while (integerIterator.hasNext())
        {
            System.out.println(pq.poll());
        }
    }
}
