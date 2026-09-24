package twoDarray;

import java.util.Scanner;

public class PrintElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Rows : ");
        int row=sc.nextInt();
        System.out.println("Enter Columns : ");
        int columns=sc.nextInt();

        int[][]arr=new int[row][columns];

        System.out.println("Enter elements of array : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<columns;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Matrix is : ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
