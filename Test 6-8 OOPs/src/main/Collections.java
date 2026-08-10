package main;

import entity.Customer;
import entity.Product;
import entity.Review;
import entity.Seller;
import order.OnlineOrder;
import order.Order;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
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

        ArrayList<Customer> customers=new ArrayList<>();
        customers.add(new Customer(1, "Rohit", 8975132553L, "rohit@gmail.com", "MP"));
        customers.add(new Customer(2, "Amit", 9876543210L, "amit@gmail.com", "MH"));
        customers.add(new Customer(3, "Priya", 9123456789L, "priya@gmail.com", "KA"));
        customers.add(new Customer(4, "Sneha", 9988776655L, "sneha@gmail.com", "GJ"));
        customers.add(new Customer(5, "Rahul", 9012345678L, "rahul@gmail.com", "RJ"));

        ArrayList<Seller> sellers=new ArrayList<>();
        sellers.add(new Seller(1, "Mohit", "TATA", 5));
        sellers.add(new Seller(2, "Raj", "interfacepack.Amazon", 4));
        sellers.add(new Seller(3, "Neha", "Flipkart", 5));
        sellers.add(new Seller(4, "Vikas", "Reliance", 3));
        sellers.add(new Seller(5, "Anjali", "Samsung", 4));

        ArrayList<Order> orderArrayList=new ArrayList<>();
        orderArrayList.add(new OnlineOrder(1001, customers.get(0), products.get(0), 2, 4000.0, 0.0, "Packed", "Pune"));
        orderArrayList.add(new OnlineOrder(1002, customers.get(1), products.get(1), 1, 4500.0, 0.0, "Shipped", "Mumbai"));
        orderArrayList.add(new OnlineOrder(1003, customers.get(2), products.get(2), 1, 12000.0, 0.0, "Delivered", "Bangalore"));
        orderArrayList.add(new OnlineOrder(1004, customers.get(3), products.get(3), 2, 7000.0, 0.0, "Out For entity.Delivery", "Ahmedabad"));
        orderArrayList.add(new OnlineOrder(1005, customers.get(4), products.get(4), 1, 1800.0, 0.0, "Packed", "Jaipur"));

        HashMap<Integer, Product>  productMap = new HashMap<>();
        productMap.put(101, products.get(0));
        productMap.put(201, products.get(1));
        productMap.put(202, products.get(2));
        productMap.put(203, products.get(3));
        productMap.put(204, products.get(4));
        productMap.put(205, products.get(5));

        HashMap<Integer,Customer> customerHashMap=new HashMap<>();
        customerHashMap.put(1,customers.get(0));
        customerHashMap.put(2,customers.get(1));
        customerHashMap.put(3,customers.get(2));
        customerHashMap.put(4,customers.get(3));
        customerHashMap.put(5,customers.get(4));

        HashMap<Integer, Seller> selleHashMap = new HashMap<>();
        selleHashMap.put(1, sellers.get(0));
        selleHashMap.put(2, sellers.get(1));
        selleHashMap.put(3, sellers.get(2));
        selleHashMap.put(4, sellers.get(3));
        selleHashMap.put(5, sellers.get(4));


    }
}
