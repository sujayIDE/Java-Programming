package smarthomesystem;

public class SmartTv implements Switchable,InterNetConnected{
    private String brand;
    private String model;
    private double screenSize;
    private String wifiName;

    public SmartTv(String brand, String model, double screenSize, String wifiName) {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.wifiName = wifiName;
    }

    @Override
    public void turnOn() {
        System.out.println("Turn On TV......");
    }

    @Override
    public void turnOf() {
        System.out.println("Turn Off....");
    }

    @Override
    public void connectWifi() {
        System.out.println("Connected to wifi.....");
    }

    @Override
    public void disConnectWifi() {
        System.out.println("Disconnect from wifi....");
    }

    void displayDeviceDetails()
    {
        System.out.println("Brand : "+brand);
        System.out.println("Model : "+model);
        System.out.println("ScreenSize : "+screenSize);
        System.out.println("Wifi Name : "+wifiName);
    }
}
