package com.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveZeroes {
    static void movezeroes(int[]arr)
    {
        int left=0;
        int right=0;

        //right scans every element from left to right.
        //left keeps track of the position where the next non-zero element should be placed.
       while (right<arr.length)
       {
           if(arr[right]!=0)
           {
               int temp=arr[left];
               arr[left]=arr[right];
               arr[right]=temp;
               left++;
           }
           right++;
       }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[]arr={4,0,6,0,1,2};
        movezeroes(arr);
    }
}
