package com.sujay.food_delivery_system;

public class Nonveg_Order extends Food_Order{
    private double packing_charge;
    private double chicken_charge;

    public Nonveg_Order(int order_id, String customer_name, int basePrice, double packing_charge, double chicken_charge) {
        super(order_id, customer_name, basePrice);
        this.packing_charge = packing_charge;
        this.chicken_charge = chicken_charge;
    }

    @Override
    double calculateBill() {
        return getBasePrice()+packing_charge+chicken_charge;
    }

    @Override
    public String toString() {
        return super.toString()+"\n "+"Packaging charge:"+packing_charge+"\n "+"Chicken Charge:"+chicken_charge;
    }

//    public void displayNonvegOrder()
//    {
//        System.out.println("===========");
//        System.out.println("Order ID: "+getOrder_id());
//        System.out.println("Customer Name: "+getCustomer_name());
//        System.out.println("Base Price: "+getBasePrice());
////        System.out.println("Final Bill: "+calculateBill());
//    }
}
