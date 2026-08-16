package com.fail_safe;

import java.util.concurrent.ConcurrentHashMap;

public class Thread2 extends Thread{
    ConcurrentHashMap<Integer,String> integerStringConcurrentHashMap;

    public Thread2(ConcurrentHashMap<Integer, String> integerStringConcurrentHashMap) {
        this.integerStringConcurrentHashMap = integerStringConcurrentHashMap;
    }

    @Override
    public void run() {
        integerStringConcurrentHashMap.put(1,"Sujay");
        System.out.println("Thread 2 is add : "+integerStringConcurrentHashMap.get(1));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
