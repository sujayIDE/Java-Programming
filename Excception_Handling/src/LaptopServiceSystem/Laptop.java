package LaptopServiceSystem;

public class Laptop {
    static void start(String status) throws LaptoNotStarting {
        if(status.equalsIgnoreCase("notstart"))
        {
            throw new LaptoNotStarting("Laptop not starting..");
        }else{
            System.out.println("Laptop started successfully..");
        }
    }

    static void batteryStatus(int batteryPercentage) throws BatteryLow {
        if(batteryPercentage<15)
        {
            throw new BatteryLow("Battery level is critically low...");
        }else{
            System.out.println(" Battery level is sufficient...");
        }
    }

    static void checkTemperature(int temperature) throws LaptopOverHeat {
        if(temperature>80)
        {
            throw new LaptopOverHeat("Laptop temperature exceeded 80 degrees...");
        }else{
            System.out.println("Laptop temperature is normal...");
        }
    }
}
