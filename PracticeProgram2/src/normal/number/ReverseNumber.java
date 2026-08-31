package normal.number;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();

        int temp=n;
        int num2=0;
        while (temp!=0)
        {
            int digit=temp%10;
            num2=num2*10+digit;
            temp/=10;
        }

        System.out.println(num2);
    }
}
