package com.daemon;

import com.join.Mythread2;

public class Main {
    public static void main(String[] args) {
        Mythread1 mythread1=new Mythread1();
        Mythread2 mythread2=new Mythread2();

        mythread2.setDaemon(true);

        mythread1.start();
        mythread2.start();
    }
}
