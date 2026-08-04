package smarthomesystem;

public class Driver {
    public static void main(String[] args) {
        SmartTv smartTv=new SmartTv("LG","10101",42.5,"Airtel");
        smartTv.displayDeviceDetails();
        smartTv.turnOn();
        smartTv.connectWifi();
        smartTv.disConnectWifi();
        smartTv.turnOf();
    }
}
