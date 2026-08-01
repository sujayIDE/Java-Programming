package com.sujay.practice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={1,4,3,2,6,5};
        int first=0;
        int last=arr.length-1;
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            while (first<last)
            {
             temp=arr[first];
             arr[first]=arr[last];
             arr[last]=temp;
             first++;
             last--;
            }
        }

        System.out.println("Reverse Array: "+ Arrays.toString(arr));
    }
}
