package com.fail_safe;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Thread1 extends Thread{
    ConcurrentHashMap<Integer,String> integerConcurrentHashMap;

    public Thread1(ConcurrentHashMap<Integer, String> integerConcurrentHashMap) {
        this.integerConcurrentHashMap = integerConcurrentHashMap;
    }

    @Override
    public void run() {
        Iterator<Map.Entry<Integer,String>> itr=integerConcurrentHashMap.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println(entry.getKey()+"->"+entry.getValue());

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
