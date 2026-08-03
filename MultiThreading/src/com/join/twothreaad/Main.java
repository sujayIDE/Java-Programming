package com.join.twothreaad;

public class Main {
    public static void main(String[] args) {
        ThreadA threadA=new ThreadA();
        ThreadB threadB=new ThreadB();

        threadA.start();
        try {
            threadA.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        threadB.start();
    }
}
