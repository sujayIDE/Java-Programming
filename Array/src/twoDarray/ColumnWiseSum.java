package twoDarray;

import java.util.Scanner;

public class ColumnWiseSum {
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

        for(int i=0;i<column;i++)
        {
            int sum=0;
            for(int j=0;j<row;j++)
            {
                sum+=arr[j][i];
            }
            System.out.println("Column "+i+" "+sum);
        }

    }
}

