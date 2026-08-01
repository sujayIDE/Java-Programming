package com.pattern;

public class SandGlass {
    public static void main(String[] args) {
        int n=4;

        //upper
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i-1;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=n-i+1;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        //lower
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=i-1;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=n-i+1;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
