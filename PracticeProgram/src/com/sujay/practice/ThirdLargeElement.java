package com.sujay.practice;

public class ThirdLargeElement {
    public static void main(String[] args) {
        int arr[]={2,4,1,6,10};
        int first_max=Integer.MIN_VALUE;
        int second_max=Integer.MIN_VALUE;
        int third_max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>first_max)
            {
                third_max=second_max;
                second_max=first_max;
                first_max=arr[i];
            } else if (arr[i]>second_max && arr[i]<first_max) {
                third_max=second_max;
                second_max=arr[i];
            } else if (arr[i]>third_max && arr[i]<second_max) {
                third_max=arr[i];
            }
        }
        System.out.println("ThirdMax: "+third_max);
    }
}
