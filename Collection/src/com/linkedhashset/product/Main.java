package com.linkedhashset.product;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Product> productSet=new LinkedHashSet<>();

        productSet.add(new Product(101,"Keyboard",100.0));
        productSet.add(new Product(102,"Mouse",50.0));
        productSet.add(new Product(103,"Laptop",150.0));
        productSet.add(new Product(103,"Laptop",150.0));

        //recently visited product
        List<Product> productList=new ArrayList<>(productSet);
        ListIterator<Product> productListIterator=productList.listIterator(productList.size());
        while (productListIterator.hasPrevious())
        {
            Product product=productListIterator.previous();
            System.out.println(product);
        }

        System.out.println();
       //remove product using product id
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Product Id to remove...");
        int id=sc.nextInt();

        Iterator<Product> productIterator=productSet.iterator();
        boolean flag=false;
        while (productIterator.hasNext())
        {
            Product product1=productIterator.next();
            if(product1.getProductId()==id)
            {
                productIterator.remove();
                System.out.println("Removed...");
                flag=true;
                break;
            }
        }
        if(!flag)
        {
            System.out.println("Product is not available....");
        }

//        //total unique product

        System.out.println(productSet.size());
    }
}
