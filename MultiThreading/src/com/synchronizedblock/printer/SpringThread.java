package com.synchronizedblock.printer;

public class SpringThread extends Thread{
    Printer printer;

    public SpringThread(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.print("Spring Notes...");
    }
}


