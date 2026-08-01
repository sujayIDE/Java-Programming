package com.twodarray;

import java.util.Scanner;

public class Sum_Of_Elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row: ");
        int row=sc.nextInt();
        System.out.println("Enter col: ");
        int col=sc.nextInt();
        int[][] matrix=new int[row][col];
        System.out.println("Enter element: ");
        int sum=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                matrix[i][j]=sc.nextInt();
                sum=sum+matrix[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum Of elements: "+sum);
    }
}
