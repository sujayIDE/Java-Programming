package com.array;

import java.util.Arrays;

public class MovesAllZeroesToEnf {
    static void moveZeroes(int[] arr)
    {
        int left=0;
        int right=0;
        while(right<arr.length)
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
        int [] arr={0,1,0,3,12};
        moveZeroes(arr);
    }
}
