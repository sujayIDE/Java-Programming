package com.array.twoDarray;

public class MultiplicationNestedForLoop {
    public static void main(String[] args) {
        int row=4;
        int column=5;

        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=column;j++)
            {
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}
