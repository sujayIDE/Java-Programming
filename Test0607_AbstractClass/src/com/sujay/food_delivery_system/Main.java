package com.sujay.food_delivery_system;

public class Main {
    public static void main(String[] args) {
        Food_Order veg_order=new Veg_Order(101,"Rohit",100,20);
        Food_Order nonveg_order=new Nonveg_Order(102,"Ajay",200,25.0,250.0);
        double veg_finalBill;
        veg_finalBill=veg_order.calculateBill();

        double nonveg_finalBill;
        nonveg_finalBill=nonveg_order.calculateBill();
        System.out.println("=========VEG ORDER=========");
        System.out.println(veg_order.toString());
        System.out.println("==========NONVEG ORDER========");
        System.out.println(nonveg_order.toString());

        System.out.println("======Veg Order==========");
        System.out.println("Details: " +"\n"+veg_order.toString());
        System.out.println("Final Bill: "+veg_finalBill);
        System.out.println();
        System.out.println("=====Nonveg Order============");
        System.out.println("Details: "+"\n"+nonveg_order.toString());
        System.out.println("Final Bill: "+nonveg_finalBill);



    }
}
