package twoDarray;

import java.util.Scanner;

public class RowWiseSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row : ");
        int row=sc.nextInt();
        System.out.println("Enter column : ");
        int column=sc.nextInt();

        int[][]arr=new int[row][column];

        System.out.println("Enter elements : ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println();

        for(int i=0;i<row;i++)
        {
            int sum=0;
            for(int j=0;j<column;j++)
            {
                sum+=arr[i][j];
            }
            System.out.println("Row "+i+" "+sum);
        }

    }
}

