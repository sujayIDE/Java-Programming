package main;

import entity.Customer;
import entity.Product;
import interfacepack.Amazon;
import order.OnlineOrder;
import order.Order;
import payment.CardPayment;
import payment.CashOnDelivery;
import payment.Payment;
import payment.UpiPayment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Customer> customers=new ArrayList<>();
        customers.add(new Customer(1, "Rohit", 8975132553L, "rohit@gmail.com", "MP"));
        customers.add(new Customer(2, "Amit", 9876543210L, "amit@gmail.com", "MH"));
        customers.add(new Customer(3, "Priya", 9123456789L, "priya@gmail.com", "KA"));
        customers.add(new Customer(4, "Sneha", 9988776655L, "sneha@gmail.com", "GJ"));
        customers.add(new Customer(5, "Rahul", 9012345678L, "rahul@gmail.com", "RJ"));

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(101, "Keyboard", "Electronics", "Circle", 2000.0, 20, 1, 5));
        products.add(new Product(201, "Smart Watch", "Accessories", "Circle", 4500.0, 25, 4, 10));
        products.add(new Product(202, "Gaming Chair", "Furniture", "Rectangle", 12000.0, 8, 5, 15));
        products.add(new Product(203, "Coffee Maker", "Home Appliance", "Cylinder", 3500.0, 12, 3, 8));
        products.add(new Product(204, "Backpack", "Bags", "Rectangle", 1800.0, 40, 4, 5));
        products.add(new Product(205, "Bluetooth Speaker", "Electronics", "Circle", 2500.0, 35, 5, 12));
        products.add(new Product(206, "Laptop", "Electronics", "Rectangle", 55000.0, 15, 6, 20));
        products.add(new Product(207, "Office Table", "Furniture", "Rectangle", 8500.0, 10, 5, 18));
        products.add(new Product(208, "Wireless Mouse", "Electronics", "Circle", 1200.0, 50, 2, 6));
        products.add(new Product(209, "Water Bottle", "Kitchen", "Cylinder", 800.0, 60, 3, 7));

        HashMap<Integer,Customer> customerHashMap=new HashMap<>();
        customerHashMap.put(1,customers.get(0));
        customerHashMap.put(2,customers.get(1));
        customerHashMap.put(3,customers.get(2));
        customerHashMap.put(4,customers.get(3));
        customerHashMap.put(5,customers.get(4));

        Scanner sc=new Scanner(System.in);
        System.out.println("=======SEARCH PRODUCT========");
        System.out.print("Search Product : ");
        String searchProduct=sc.nextLine();
        Amazon amazon=new Amazon(products);
        Product product=amazon.searchProduct(searchProduct);

        System.out.println();

        System.out.println("=======PLACE ORDER===========");
        Order order=new OnlineOrder(10001,customerHashMap.get(1),product,2,0.0,0.0,"Packed",null);

        amazon.setOrder(order);

        System.out.println("Enter Coupon : ");
        String couponCode=sc.nextLine();
        amazon.applyCoupon(couponCode);
        order.placeOrder();

        System.out.println();


        System.out.println("========PAYMENT==========");
        System.out.println("Payment Type : ");
        System.out.println("1.UPI");
        System.out.println("2.Card");
        System.out.println("3.Cash On Delivery");
        System.out.println("--------------------------------------");
        System.out.println("Enter payment Type");
        String choice=sc.nextLine();

        Payment payment;
        switch (choice)
        {
            case "UPI"->{
                payment=new UpiPayment(10101,order.getTotalAmount());
                payment.pay();
            }

            case "Card"->{
                payment=new CardPayment(20101,order.getTotalAmount());
                payment.pay();
            }

            case "Cash On Delivery" ->{
                payment=new CashOnDelivery(3010101,order.getTotalAmount());
                payment.pay();
            }
        }

        System.out.println();

        System.out.println("=======INVOICE=========");
        System.out.println("Invoice Number : INV1001");
        System.out.println("Customer Name  : "+customerHashMap.get(1).getCustomerName());
        System.out.println("Product        : "+product.getProductName());
        System.out.println("Original Price : "+product.getPrice());
        System.out.println("Discount       : "+order.getDiscount());
        System.out.println("Total Amount   : "+order.getTotalAmount());


    }
}
