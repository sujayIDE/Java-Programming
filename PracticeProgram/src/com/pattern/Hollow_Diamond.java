package com.pattern;

public class Hollow_Diamond {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
               if(k==1||k==2*i-1)
               {
                   System.out.print("* ");
               }else {
                   System.out.print("  ");
               }

            }
            System.out.println();
        }

        //lower
        for(int i=2;i<=n;i++)
        {
            for(int j=1;j<=i-1;j++)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=2*(n-i)+1;k++)
            {
                if(k==1||k==2*(n-i)+1)
                {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
