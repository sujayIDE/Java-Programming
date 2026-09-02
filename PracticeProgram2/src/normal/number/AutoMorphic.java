package normal.number;

import java.util.Scanner;

public class AutoMorphic {
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
        System.out.println("Length = "+length);

        int square=n*n;
        System.out.println("Square = "+square);

        int divisor=1;
        for(int i=1;i<=length;i++)
        {
            divisor*=10;
        }

        int num2=square%divisor;

        if(n==num2)
        {
            System.out.println("number is automorphic ....");
        }else{
            System.out.println("not");
        }


    }
}
