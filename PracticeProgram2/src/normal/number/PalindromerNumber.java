package normal.number;

import java.util.Scanner;

public class PalindromerNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();

        int temp=n;
        int num1=0;
        while (temp!=0)
        {
            int digit=temp%10;
            num1=num1*10+digit;
            temp/=10;
        }

        if(num1==n)
        {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not");
        }
    }
}
