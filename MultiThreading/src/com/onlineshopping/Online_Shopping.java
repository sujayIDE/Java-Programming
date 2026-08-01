package com.onlineshopping;

public class Online_Shopping {
    private int availableProducts;

    public Online_Shopping(int availableProducts) {
        this.availableProducts = availableProducts;
    }

    public synchronized void buyProduct(int quantity) throws InterruptedException {
        while(quantity>availableProducts)
        {
            System.out.println("Wait....Stock is not available...");
            wait();
        }
        System.out.println("Product is buy");
        availableProducts=availableProducts-quantity;
        System.out.println("Available Prodcut: "+availableProducts);
        notifyAll();
    }

    public synchronized void addProduct(int quanity)
    {

        while (quanity<=0)
        {
            System.out.println("Enter valid quantity");
            return;
        }
        System.out.println("Product is added...");
        availableProducts+=quanity;
        System.out.println("Available Product: "+availableProducts);
        notifyAll();
    }
}
