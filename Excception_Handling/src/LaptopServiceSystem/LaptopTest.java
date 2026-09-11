package LaptopServiceSystem;

import java.util.Scanner;

public class LaptopTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter laptop start status (start/notstart) :");
        String status=sc.nextLine();
        try {
            Laptop.start(status);

            System.out.println("Battery Percentage : ");
            int percentage=sc.nextInt();

            System.out.println("Enter CPU temperature : ");
            int temperature=sc.nextInt();

            Laptop.batteryStatus(percentage);
            Laptop.checkTemperature(temperature);
        } catch (LaptoNotStarting e) {
            System.out.println(e.getMessage());
        } catch (BatteryLow e) {
            System.out.println(e.getMessage());
        } catch (LaptopOverHeat e) {
            System.out.println(e.getMessage());
        }
    }
}
