package com.synchronizedblock.printer;

public class Main {
    public static void main(String[] args) {
        Printer printer=new Printer();

        JavaThread javaThread=new JavaThread(printer);
        SpringThread springThread=new SpringThread(printer);

        javaThread.start();
        springThread.start();
    }
}
