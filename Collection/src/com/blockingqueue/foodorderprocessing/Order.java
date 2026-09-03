package com.blockingqueue.foodorderprocessing;

public class Order {
    private int orderId;
    private String customerName;
    private String foodItem;

    public Order(int orderId, String customerName, String foodItem) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.foodItem = foodItem;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", foodItem='" + foodItem + '\'' +
                '}';
    }
}
