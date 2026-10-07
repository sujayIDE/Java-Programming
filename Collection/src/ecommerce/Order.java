package ecommerce;

public class Order {
    private int orderId;
    private String customerName;
    private String productName;
    private String orderStatus;

    public Order(int orderId, String customerName, String productName, String orderStatus) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.productName = productName;
        this.orderStatus = orderStatus;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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
                ", customerName='" + customerName + '\'' +
                ", productName='" + productName + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                '}';
    }
}
