import java.util.Scanner;

public class TimeOFDayBasedOnHour {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("===========================");
        System.out.println("   TIME OF DAY IDENTIFIER   ");
        System.out.println("============================");
        System.out.print("Enter Time (24 hours format): ");
        int time=sc.nextInt();

        if(time>=5 && time<=11)
        {
            System.out.println("It's Morning");
        } else if (time>=12 && time<=16) {
            System.out.println("It's Afternoon");
        } else if (time>=17 && time<=20) {
            System.out.println("It's Evening");
        } else if (time>=21 && time<=23 || time>=0 && time<=4) {
            System.out.println("It's Night");
        }else
            System.out.println("Invalid hour! Please enter a value between 0 and 23.");
    }
}
