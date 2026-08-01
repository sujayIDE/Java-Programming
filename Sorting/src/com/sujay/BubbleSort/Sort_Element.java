package com.sujay.BubbleSort;

import java.util.Arrays;

//Bubble Sort
public class Sort_Element {
    public static void main(String[] args) {
        int arr[]={20,3,50,9,6};
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
