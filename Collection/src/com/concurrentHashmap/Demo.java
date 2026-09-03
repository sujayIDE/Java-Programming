package com.concurrentHashmap;

import com.fail_safe.Thread1;
import com.fail_safe.Thread2;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Demo {
    public static void main(String[] args) {
        ConcurrentMap<Integer,String> integerStringConcurrentMap=new ConcurrentHashMap<>();

        Thread thread1 =new Thread(()->{
            for(int i=1;i<=10;i++)
            {
                integerStringConcurrentMap.put(i,"Hello");
                System.out.println(i+" "+"Hello");
            }
        });

        Thread thread2=new Thread(()->{
            for(int i=11;i<=20;i++)
            {
                integerStringConcurrentMap.put(i,"World");
                System.out.println(i+" "+"World");
            }
        });

        thread1.start();
        thread2.start();
    }
}
