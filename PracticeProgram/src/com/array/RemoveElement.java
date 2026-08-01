package com.array;

public class RemoveElement {
    static int removeElement(int[] arr,int value)
    {
        int left=0;
        int right=0;

        while(right<arr.length)
        {
            if(arr[right]!=value)
            {
                arr[left]=arr[right];
                left++;
            }
            right++;
        }
        return left;
    }
    public static void main(String[] args) {
        int [] arr={3, 2, 2, 3};
        int value=3;
        int count=removeElement(arr,value);

        for(int i=0;i<count;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
