public class OnlineOrder extends Order{
    private String address;
    public OnlineOrder(int orderId, Customer customer, Product product, int quantity, double totalAmount, String orderStatus, String address) {
        super(orderId, customer, product, quantity, totalAmount, orderStatus);
        this.address = address;
    }

    @Override
    public void placeOrder() {
        System.out.println("Online Order Placed...");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Online Order Canceled,,,");
    }

    @Override
    public void calculateTotal() {
        double totalBill=getProduct().getPrice()*getQuantity();
        System.out.println("Online TotalBill : "+totalBill);
    }
}
