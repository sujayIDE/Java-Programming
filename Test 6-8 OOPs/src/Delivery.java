public class Delivery {
    private int deliveryId;
    private Order order;
    private String deliveryPartner;
    private int exceptedDate;
    private String currentLocation;
    private String status;

    public Delivery(int deliveryId, Order order, String deliveryPartner, int exceptedDate, String currentLocation, String status) {
        this.deliveryId = deliveryId;
        this.order = order;
        this.deliveryPartner = deliveryPartner;
        this.exceptedDate = exceptedDate;
        this.currentLocation = currentLocation;
        this.status = status;
    }

    void trackOrder()
    {

    }

    void updateStatus(){

    }
}
