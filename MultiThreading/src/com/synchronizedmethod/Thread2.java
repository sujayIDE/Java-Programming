package com.synchronizedmethod;

public class Thread2 extends Thread{
    Table table;

    public Thread2(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        table.printTable(10);
    }
}
