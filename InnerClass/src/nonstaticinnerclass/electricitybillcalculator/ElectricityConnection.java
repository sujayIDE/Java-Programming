package nonstaticinnerclass.electricitybillcalculator;

import java.util.Scanner;

public class ElectricityConnection {
    String consumerName;
    int units;

    public ElectricityConnection(String consumerName, int units) {
        this.consumerName = consumerName;
        this.units = units;
    }

    class Bill{
        void calculateBill()
        {
            int bill=units*8;

            System.out.println("Consumer name : "+consumerName);
            System.out.println("Units         : "+units);
            System.out.println("Total Bill    : "+bill);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Consumer name :");
        String name=sc.nextLine();

        System.out.println("Enter Units : ");
        int unit=sc.nextInt();

        ElectricityConnection electricityConnection=new ElectricityConnection(name,unit);
        ElectricityConnection.Bill eb=electricityConnection.new Bill();
        eb.calculateBill();
    }
}
