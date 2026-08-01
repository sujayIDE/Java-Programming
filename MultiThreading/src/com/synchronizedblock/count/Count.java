package com.synchronizedblock.count;

public class Count {
    int count=0;

    void  increment()
    {
        synchronized (this)
        {
            count++;
        }
    }
}
