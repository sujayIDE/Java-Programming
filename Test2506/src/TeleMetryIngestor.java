import java.util.Scanner;

public class TeleMetryIngestor {
    public static void main(String[] args) {
        String agent_status="Available";
        int delivery_count=0;
        int fuel=100;

        System.out.println("1.Order_Assigned");
        System.out.println("2.Order_delisverd");
        System.out.println("3.Fuel_Update");
        System.out.println("4.Shift_End");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter choice: ");
        int choice=sc.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("===Order Assigned===");
//                agent_status="Available";
                if(agent_status.equals("Available"))
                {
                    agent_status="Busy";
                    System.out.println("[LOG] Order assigned. Agent status changed to BUSY.");
                }else {
                    System.out.println("[REJECTED] Cannot assign order. Agent is already BUSY or offline.");
                }
                break;

            case 2:
                System.out.println("===Order Delivered===");
//                agent_status="Busy";
                if(agent_status.equals("Busy"))
                {
                    agent_status="Available";
                    delivery_count++;
                    System.out.println("[LOG] Order successfully delivered! Agent status reverted to AVAILABLE.");
                }
                else{
                    System.out.println("[REJECTED] Error: Agent cannot deliver an order without being assigned one first!"
                    );
                }
                break;

            case 3:
                System.out.println("===Fuel Update===");
                System.out.println("Enter fuel consumption amount: ");
                int fuel_consumption_amount=sc.nextInt();

                if(fuel_consumption_amount>=1 && fuel_consumption_amount<=100)
                {
                    int new_fuel=fuel-fuel_consumption_amount;
                    if(fuel_consumption_amount<=0 || new_fuel<0 )
                    {
                        System.out.println("[ERROR] Invalid fuel telemetry data received.");
                    }
                    else{
                        fuel=new_fuel;
                        if(fuel<20)
                        {
                            System.out.println("\"[WARNING] Low Fuel Alert: Less than 20% remaining! Ping agent to refuel.\" \n");
                        }
                        else
                        {
                            System.out.println(" Fuel level updated to "+fuel+"%");
                        }
                    }
                }
                break;

            case 4:
                System.out.println("===Shift End===");
                if(agent_status.equals("Busy"))
                {
                    System.out.println("\"[REJECTED] Cannot end shift. Complete the active delivery first!\"");
                }
                else{
                    System.out.println("====Report===");
                    System.out.println("Total delivey: "+delivery_count);
                    System.out.println("Fuel Level: "+fuel);
                    break;
                }

        }
        sc.close();
    }
}
