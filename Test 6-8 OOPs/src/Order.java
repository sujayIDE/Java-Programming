public abstract class Order {
    private int orderId;
    private Customer customer;
    private Product product;
    private int quantity;
    private double totalAmount;
    private String orderStatus;

    public Order(int orderId, Customer customer, Product product, int quantity, double totalAmount, String orderStatus) {
        this.orderId = orderId;
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
        this.orderStatus = orderStatus;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customer=" + customer +
                ", product=" + product +
                ", quantity=" + quantity +
                ", totalAmount=" + totalAmount +
                ", orderStatus='" + orderStatus + '\'' +
                '}';
    }

    void displayOrderDetails()
    {
        toString();
    }

    public abstract void  placeOrder();
    public abstract void cancelOrder();
    public abstract void calculateTotal();
}
