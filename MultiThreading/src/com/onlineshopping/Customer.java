package com.onlineshopping;

public class Customer extends Thread{
    Online_Shopping onlineShopping;

    public Customer(Online_Shopping onlineShopping) {
        this.onlineShopping = onlineShopping;
    }

    @Override
    public void run() {
        try {
            onlineShopping.buyProduct(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
