package com.array;

public class KeepEvenNumbers {
    static void keepOddNumbers(int arr[])
    {
        int left=0;
        int right=0;

        while(right<arr.length)
        {
            if(arr[right]%2!=0)
            {
                arr[left]=arr[right];
                left++;
            }
            right++;
        }
        int count=left;
        for(int i=0;i<count;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    static void keepEvenNumbers(int arr[])
    {
        int left=0;
        int right=0;

        while (right<arr.length)
        {
            if(arr[right]%2==0)
            {
                arr[left]=arr[right];
                left++;
            }
            right++;
        }
        int count=left;
        for(int i=0;i<count;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[]arr={3, 2, 5, 8, 6, 7};
        int[]arr1={3, 2, 5, 8, 6, 7};
        keepEvenNumbers(arr);
        System.out.println();
        keepOddNumbers(arr1);
    }
}
