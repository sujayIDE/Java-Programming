package order;

import entity.Customer;
import entity.Product;

public class OnlineOrder extends Order{
    private String address;

    public OnlineOrder(int orderId, Customer customer, Product product, int quantity, double totalAmount, double discount, String orderStatus, String address) {
        super(orderId, customer, product, quantity, totalAmount, discount, orderStatus);
        this.address = address;
    }

    @Override
    public void placeOrder() {
        System.out.println("Order Id : "+getOrderId());
        System.out.println("Customer Name : "+getCustomer().getCustomerName());
        System.out.println("Product Name : "+getProduct().getProductName());
        System.out.println("Quantity : "+getQuantity());
        calculateTotal();

        System.out.println("Your Order Is Placed....!!!");
    }

    @Override
    public void placeOrder(Product p, int quantity) {

    }

    @Override
    public void placeOrder(Product p, int quantity, String coupon) {

    }

    @Override
    public void cancelOrder() {
        System.out.println("Online order.Order Canceled,,,");
    }

    @Override
    public void calculateTotal() {
        double totalBill=getProduct().getPrice()*getQuantity();
        totalBill=totalBill-getDiscount();
        System.out.println("Online TotalBill : "+totalBill);
        setTotalAmount(totalBill);
    }
}
