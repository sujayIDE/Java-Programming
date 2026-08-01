package com.array;

public class MaxConsecutiveNumber {
    public static void main(String[] args) {
        int arr[]={4,3,1,1,1,3,3,2,3};
        int max=0;
        int element=0;
        int count=1;
        int n=arr.length;

        for(int i=0;i<n-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                count++;
            }else
                count=1;

            if(count>max)
            {
                element=arr[i];
                max=count;
            }
        }
        System.out.println(("The maximum consecutively repeated element : " + element));

    }
}
