package com.array;

public class ProductOfArrayExceptItSelf {
    static void product(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int product=1;
            for(int j=0;j<arr.length;j++)
            {
                if (j==i)
                {
                    continue;
                }
                product*=arr[j];
            }
            System.out.println(product);
        }
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4};
        product(arr);
    }
}
