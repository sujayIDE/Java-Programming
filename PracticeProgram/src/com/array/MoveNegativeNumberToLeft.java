package com.array;

import java.util.Arrays;

public class MoveNegativeNumberToLeft {
    static void moveNegative(int arr[])
    {
        int left=0;
        int right=0;

        while (right<arr.length)
        {
            if(arr[right]<0)
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
        int []arr={2, -4, 5, -1, -8, 7};
        moveNegative(arr);
    }
}
