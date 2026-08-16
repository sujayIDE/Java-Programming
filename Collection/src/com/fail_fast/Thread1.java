package com.fail_fast;

import java.util.ArrayList;
import java.util.Iterator;

public class Thread1 extends Thread{
    ArrayList<Integer> integers ;

    public Thread1(ArrayList<Integer> integers) {
        this.integers = integers;
    }

    @Override
    public void run() {
        Iterator<Integer>  integerIterator=integers.iterator();
        while(integerIterator.hasNext())
        {
            System.out.println(integerIterator.next());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
