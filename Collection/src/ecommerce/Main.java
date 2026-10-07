package ecommerce;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order(101, "Rahul", "Laptop", "DELIVERED"),
                new Order(102, "Amit", "Mouse", "CANCELLED"),
                new Order(103, "Rahul", "Keyboard", "DELIVERED"),
                new Order(104, "Priya", "Laptop", "SHIPPED"),
                new Order(105, "Amit", "Keyboard", "DELIVERED"),
                new Order(106, "Rahul", "Mouse", "CANCELLED"),
                new Order(107, "Priya", "Mouse", "DELIVERED")
        );

        Map<String,Integer> frequency=new HashMap<>();

        for(Order order:orders)
        {
            if(frequency.containsKey(order.getCustomerName()))
            {
                frequency.put(order.getCustomerName(),frequency.get(order.getCustomerName())+1);
            }else{
                frequency.put(order.getCustomerName(),1);
            }
        }
        System.out.println(frequency);
    }
}
