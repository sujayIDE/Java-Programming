package com.threeDarray;

import java.util.Scanner;

public class ThreeDArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Depth");
        int depth=scanner.nextInt();

        System.out.println("Enter Rows :");
        int rows=scanner.nextInt();

        System.out.println("Enter Column: ");
        int col=scanner.nextInt();

        int[][][] arr=new int[depth][rows][ col];

        for(int i=0;i<depth;i++)
        {
            for(int j=0;j<rows;j++)
            {
                for(int k=0;k<col;k++)
                {
                    arr[i][j][k]=scanner.nextInt();
                }
            }
        }

        System.out.println("Array Elements are : ");
        for(int i=0;i<depth;i++)
        {
            System.out.println("depth: "+i);

            for(int j=0;j<rows;j++)
            {
                for(int k=0;k<col;k++)
                {
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        scanner.close();
    }
}
