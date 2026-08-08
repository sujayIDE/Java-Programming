package order;

import entity.Customer;
import entity.Product;

public class StorePickupOrder extends Order {
    private String pickupLocation;

    public StorePickupOrder(int orderId, Customer customer, Product product, int quantity, double totalAmount, double discount, String orderStatus, String pickupLocation) {
        super(orderId, customer, product, quantity, totalAmount, discount, orderStatus);
        this.pickupLocation = pickupLocation;
    }


    @Override
    public void placeOrder() {

    }

    @Override
    public void placeOrder(Product p, int quantity) {

    }

    @Override
    public void placeOrder(Product p, int quantity, String coupon) {

    }

    @Override
    public void cancelOrder() {

    }

    @Override
    public void calculateTotal() {
        double totalBill=getProduct().getPrice()*getQuantity();
        totalBill=totalBill-getDiscount();
        System.out.println("StorePickUp TotalBill : "+totalBill);
    }
}
