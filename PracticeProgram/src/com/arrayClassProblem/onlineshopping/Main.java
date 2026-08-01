package com.arrayClassProblem.onlineshopping;

public class Main {
    public static void main(String[] args) {
        Product[] products={
                new Product(101,"Monitor",350,10),
                new Product(102,"Mouse",100,20),
                new Product(103,"Keyboard",450,10)
        };

        for(Product product:products)
        {
            product.display();
            System.out.println("=========================================================");
        }
    }
}
