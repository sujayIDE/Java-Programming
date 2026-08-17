package executorframework.foodapp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FoodOrderApp {
    static void processOrder(int orderId)
    {
        System.out.println("Processing Order : "+orderId+"by "+Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Order "+orderId+" completed");
    }
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(3);
        service.submit(()->processOrder(101));
        service.submit(()->processOrder(102));
        service.submit(()->processOrder(103));
        service.submit(()->processOrder(104));
        service.submit(()->processOrder(105));

        service.shutdown();
    }
}
