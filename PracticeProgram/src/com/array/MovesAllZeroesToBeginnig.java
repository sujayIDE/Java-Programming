package com.array;

import java.util.Arrays;

public class MovesAllZeroesToBeginnig {
    static void movesZeroes(int arr[])
    {
        int left=arr.length-1;
        int right=arr.length-1;

        while(right>=0)
        {
            if(arr[right]!=0)
            {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left--;
            }
            right--;
        }

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[]={4,0,6,0,1,2};
        movesZeroes(arr);
    }
}
