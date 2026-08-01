package com.synchronizedmethod;

public class Table {
    synchronized void printTable(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n +"*"+i +"="+n*i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
