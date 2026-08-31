package normal.number;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();

        int temp=n;
        int sum=0;
        while (temp!=0)
        {
            int fact=1;
            int digit=temp%10;
            for(int i=1;i<=digit;i++)
            {
                fact=i*fact;
            }
            sum=sum+fact;
            temp=temp/10;
        }
        if(sum==n)
        {
            System.out.println("Strong number");
        }else{
            System.out.println("Not Strong number");
        }
    }
}
