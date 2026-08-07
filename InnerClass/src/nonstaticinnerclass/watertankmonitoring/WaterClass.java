package nonstaticinnerclass.watertankmonitoring;

import java.util.Scanner;

public class WaterClass {
    int capacity;
    int currentWater;

    public WaterClass(int capacity, int currentWater) {
        this.capacity = capacity;
        this.currentWater = currentWater;
    }

    class Sensor{
        void checkWaterLevel(){
            if (currentWater < (capacity * 25) / 100) {
                System.out.println("Low Water Level...");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Capacity : ");
        int capacity=sc.nextInt();
        System.out.println("Enter current water : ");
        int currentWater=sc.nextInt();

        WaterClass waterClass=new WaterClass(capacity,currentWater);
        WaterClass.Sensor ws=waterClass.new Sensor();
        ws.checkWaterLevel();
    }
}
