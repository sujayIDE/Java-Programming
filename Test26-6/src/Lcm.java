import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First number: ");
        int n1=sc.nextInt();
        System.out.print("Enter Second number: ");
        int n2=sc.nextInt();

        int max=(n1>n2)?n1:n2;
        while(true)
        {
            if(max%n1==0 && max%n2==0)
            {
                System.out.println("LCM="+max);
                break;
            }
            max++;
        }

    }
}
