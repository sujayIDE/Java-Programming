package twoDarray;

import java.util.Scanner;

public class SumOfAllElements {
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

        int sum=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                sum+=arr[i][j];
            }
        }

        System.out.println("Sum is = "+sum);
    }
}
