package com.synchronizedblock.printer;

public class JavaThread extends Thread{
    Printer printer;

    public JavaThread(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.print("Java Notes...");
    }
}
