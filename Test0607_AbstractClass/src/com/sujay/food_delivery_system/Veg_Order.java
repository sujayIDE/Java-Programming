package com.sujay.food_delivery_system;

public class Veg_Order extends Food_Order{
    private int packaging_charge;

    public Veg_Order(int order_id, String customer_name, int basePrice, int packaging_charge) {
        super(order_id, customer_name, basePrice);
        this.packaging_charge = packaging_charge;
    }

    @Override
    double calculateBill() {
        return getBasePrice()+packaging_charge;
    }

    @Override
    public String toString() {
        return super.toString()+"\n "+"Packaging Charge:"+packaging_charge;
    }

    public int getPackaging_charge() {
        return packaging_charge;
    }

    public void setPackaging_charge(int packaging_charge) {
        this.packaging_charge = packaging_charge;
    }

//    public void displayVegOrder()
//    {
//        System.out.println("===========");
//        System.out.println("Order ID: "+getOrder_id());
//        System.out.println("Customer Name: "+getCustomer_name());
//        System.out.println("Base Price: "+getBasePrice());
////        System.out.println("Final Bill: "+calculateBill());
//    }
}
