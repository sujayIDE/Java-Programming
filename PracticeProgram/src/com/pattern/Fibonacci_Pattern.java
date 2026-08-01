package com.pattern;

public class Fibonacci_Pattern {
    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=n;i++){
            int num1=0,num2=1,num3=0;
            for(int j=1;j<=i;j++)
            {
                System.out.print(num1+" ");
                num3=num1+num2;
                num1=num2;
                num2=num3;
            }
            System.out.println();
        }
    }
}
