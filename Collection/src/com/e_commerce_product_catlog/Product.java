package com.e_commerce_product_catlog;

import java.util.*;

public class Product {
    private int productId;
    private String productName;
    private int price;

    public Product(int productId, String productName, int price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        return productId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Set<Product> products = new LinkedHashSet<>();

        products.add(new Product(101, "Laptop", 55000));
        products.add(new Product(103, "Mouse", 800));
        products.add(new Product(102, "Keyboard", 1500));
        products.add(new Product(101, "Laptop", 55000));
        products.add(new Product(104, "Monitor", 12000));
        products.add(new Product(103, "Mouse", 800));

        for (Product p:products)        {
            System.out.println(p);
        }
        System.out.println();

        PriceComparator priceComparator=new PriceComparator();

        TreeSet<Product>  treeSet=new TreeSet<>(priceComparator);
        treeSet.addAll(products);

        for(Product p:treeSet)
        {
            System.out.println(p);
        }
    }
}

class PriceComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o1.getPrice(), o2.getPrice());
    }
}
