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

    public int getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getDeliveryPartner() {
        return deliveryPartner;
    }

    public void setDeliveryPartner(String deliveryPartner) {
        this.deliveryPartner = deliveryPartner;
    }

    public int getExceptedDate() {
        return exceptedDate;
    }

    public void setExceptedDate(int exceptedDate) {
        this.exceptedDate = exceptedDate;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    void trackOrder(String status) {
        System.out.println("Status : " + status);
        System.out.println("Location : " + currentLocation);
    }

    void updateStatus() {
        switch (status) {
            case "Packed" -> {
                status = "Packed";
            }
            case "Shipped" -> {
                status = "Shipped";
            }
            case "Out Of Delivery" -> {
                status = "Out Of Delivery";
            }
            case "Delivered" -> {
                status = "Delivered";
            }
            default -> System.out.println("Status is not available....");
        }
    }
}
