package fooddeliveryapp;

public class DessertOrder extends Order{
    private int pricePerItem;

    public DessertOrder(int orderId, String customerName, String restaurantName, int quantity, int pricePerItem) {
        super(orderId, customerName, restaurantName, quantity);
        this.pricePerItem = pricePerItem;
    }

    @Override
    void prepare() {
        System.out.println("Dessert prepare");
    }

    @Override
    void deliver() {
        System.out.println("Dessert is delivered...");
    }

    @Override
    void calculateBill() {
        int totalBill=getQuantity()*pricePerItem;
        System.out.println("Total Bill: "+totalBill);
    }
}
