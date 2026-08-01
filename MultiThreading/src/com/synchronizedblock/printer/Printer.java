package com.synchronizedblock.printer;

public class Printer {
    void print(String document)
    {
        synchronized (this)
        {
            System.out.println(document);
            for(int i=1;i<=5;i++)
            {
                System.out.println("Page: "+i);
            }
        }
    }
}
