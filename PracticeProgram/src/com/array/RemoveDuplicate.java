package com.array;

import java.util.Arrays;

public class RemoveDuplicate {
    static void removeDuplicate(int[]arr)
    {
        int left=0;
        int right=0;
        while (right<arr.length)
        {
            if(arr[left]!=arr[right])
            {
                left++;
                arr[left]=arr[right];
            }
            right++;
        }
        int count=left;
        for(int i=0;i<=count;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,4,4};
        removeDuplicate(arr);
    }
}
