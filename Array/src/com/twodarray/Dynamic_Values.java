package com.twodarray;

import java.util.Scanner;

public class Dynamic_Values {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows: ");
        int row=sc.nextInt();
        System.out.println("Enter col: ");
        int col=sc.nextInt();
        int[][] matrix=new int[row][col];
        System.out.println("Enter element into matrix: ");
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
