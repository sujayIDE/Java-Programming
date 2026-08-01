package com.sujay.practice;

public class Maximum_Product_Of_Consecutive_Triplet {
    public static void main(String[] args) {
        int arr[]={10,3,5,6,20};
        int product=0;
        int max_product=0;
        int temp=0;
        for(int i=0;i<arr.length-2;i++)
        {
            product=arr[i]*arr[i+1]*arr[i+2];
            if(product>max_product)
            {
                max_product=product;
            }
        }
        System.out.println("Max_Product: "+max_product);
    }
}
