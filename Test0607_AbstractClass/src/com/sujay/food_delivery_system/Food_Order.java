package com.sujay.food_delivery_system;

public abstract class Food_Order {
    private int order_id;
    private String customer_name;
    private int basePrice;

    public Food_Order(int order_id, String customer_name, int basePrice) {
        this.order_id = order_id;
        this.customer_name = customer_name;
        this.basePrice = basePrice;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    abstract double calculateBill();

    public String toString()
    {
        return "Order ID: "+order_id+" \n"+"Customer Name: "+customer_name+" \n"+ "Base Price:" +basePrice;
    }

}
