package fooddeliveryapp;

public abstract class Order {
    private int orderId;
    private String customerName;
    private String restaurantName;
    private int quantity;

    public Order(int orderId, String customerName, String restaurantName, int quantity) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.restaurantName = restaurantName;
        this.quantity = quantity;
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

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    void displayOrderDetails()
    {
        System.out.println("Order ID: "+orderId);
        System.out.println("Customer Name: "+customerName);
        System.out.println("Restaurant Name: "+restaurantName);
        System.out.println("Quantity: "+quantity);
    }

    abstract void prepare();
    abstract void deliver();
    abstract void calculateBill();

}
