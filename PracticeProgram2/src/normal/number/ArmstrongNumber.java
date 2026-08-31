package normal.number;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();

        int temp=n;
        int length=0;
        while (temp!=0)
        {
            int digit=temp%10;
            length++;
            temp/=10;
        }
        System.out.println("Length : "+length);

        int temp1=n;
        int sum=0;
        while (temp1!=0)
        {
            int power=1;
            int digit=temp1%10;
            for(int i=1;i<=length;i++)
            {
                power*=digit;
            }
            sum+=power;
            temp1/=10;
        }
     if(sum==n)
     {
         System.out.println("Armstrong number");
     }else{
         System.out.println("Not armstrong number");
     }
    }
}
