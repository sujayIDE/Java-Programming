package com.twodarray;

import java.util.Arrays;

public class Initialization_Declaration {
    public static void main(String[] args) {
        int[][]arr=new int[2][3];
        arr[0][0]=8;
        arr[1][1]=9;

       for(int i=0;i<2;i++)
       {
           for(int j=0;j<3;j++)
           {
               System.out.print(arr[i][j]+" ");
           }
           System.out.println();
       }

        System.out.println("Row: "+arr.length);
        System.out.println("Column: "+arr[0].length);
    }
}
