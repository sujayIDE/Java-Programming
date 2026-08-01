package com.array;

public class MoveAllZeroesToEnd {
    static void movezeroes(int[] arr)
    {
        int left=0;
        int right=0;

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
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        int []arr={1,0,2,0,3,0,4};
        movezeroes(arr);
    }
}
