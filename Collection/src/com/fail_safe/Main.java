package com.fail_safe;

import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String> integerStringConcurrentHashMap=new ConcurrentHashMap<>();
        Thread1 thread1=new Thread1(integerStringConcurrentHashMap);
        Thread2 thread2=new Thread2(integerStringConcurrentHashMap);

        thread1.start();
        thread2.start();
    }
}
