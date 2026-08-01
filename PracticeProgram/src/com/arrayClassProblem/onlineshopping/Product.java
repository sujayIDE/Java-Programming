package com.arrayClassProblem.onlineshopping;

public class Product {
    int productId;
    String productName;
    int price;
    int quantity;

    public Product(int productId, String productName, int price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    int calculate()
    {
        int total=price*quantity;
        return total;
    }

    void display()
    {
        System.out.println("Product Id : "+productId);
        System.out.println("Product Name :"+productName);
        System.out.println("Price :"+price);
        System.out.println("Quantity :"+quantity);
        System.out.println("Amount: "+calculate());
    }
}
