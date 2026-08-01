package com.anonymousClass;

public class Demo {
    public static void demo1()
    {
        Myinterface mi=new Myinterface() {
            @Override
            public void m1() {
                System.out.println("M1 method");
            }
        };
        mi.m1();
    }

    public static void main(String[] args) {
        Demo.demo1();
    }
}
