package com.array;

public class SumGivenTarget {
    static void sum(int[]arr,int k)
    {
        int left=0;
        int right=arr.length-1;
        while (left<right)
        {
            if(arr[left]+arr[right]==k)
            {
                System.out.println(arr[left]+"+"+arr[right]);
                break;
            } else if (arr[left]+arr[right]>k) {
                right--;
            }else {
                left++;
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={2,7,11,15};
        int k=9;
        sum(arr,k);
    }
}
