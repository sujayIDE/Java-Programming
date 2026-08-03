package fooddeliveryapp;

public class NonVegOrder extends Order{
    private int pricePerItem;

    public NonVegOrder(int orderId, String customerName, String restaurantName, int quantity, int pricePerItem) {
        super(orderId, customerName, restaurantName, quantity);
        this.pricePerItem = pricePerItem;
    }

    @Override
    void prepare() {
        System.out.println("NonVeg Order is prepare...");
    }

    @Override
    void deliver() {
        System.out.println("Nonveg order is delivered...");
    }

    @Override
    void calculateBill() {
        int totalBill=getQuantity()*pricePerItem;
        System.out.println("Total Bill: "+totalBill);
    }
}
