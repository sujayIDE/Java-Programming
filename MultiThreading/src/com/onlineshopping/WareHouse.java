package com.onlineshopping;

public class WareHouse extends Thread{
    Online_Shopping onlineShopping;

    public WareHouse(Online_Shopping onlineShopping) {
        this.onlineShopping = onlineShopping;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        onlineShopping.addProduct(1);
    }
}
