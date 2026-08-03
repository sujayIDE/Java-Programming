package fooddeliveryapp;

public class VegOrder extends Order{
    private int pricePerItem;

    public VegOrder(int orderId, String customerName, String restaurantName, int quantity, int pricePerItem) {
        super(orderId, customerName, restaurantName, quantity);
        this.pricePerItem = pricePerItem;
    }

    @Override
    void prepare() {
        System.out.println("Veg Oder is Prepare....");
    }

    @Override
    void deliver() {
        System.out.println("Veg Order is Delivered...");
    }

    @Override
    void calculateBill() {
        int totalBill=getQuantity()*pricePerItem;
        System.out.println("Total Bill : "+totalBill);
    }
}
