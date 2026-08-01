package com.onlineshopping;

public class Main {
    public static void main(String[] args) {
        Online_Shopping onlineShopping=new Online_Shopping(1);

        Customer customer=new Customer(onlineShopping);
        WareHouse wareHouse=new WareHouse(onlineShopping);
        customer.start();
        wareHouse.start();
    }
}
