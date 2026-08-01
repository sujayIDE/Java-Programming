package com.array;

public class TwoSum {
    static void twoSum(int[]arr,int target)
    {
        int left=0;
        int right=arr.length-1;
        while (left<right)
        {
            if(arr[left]+arr[right]==target)
            {
                System.out.println(arr[left]);
                System.out.println(arr[right]);
                return;
            }
            if(arr[left]+arr[right]>target)
            {
                right--;
            }else {
                left++;
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={2,7,11,15};
        int target=9;
        twoSum(arr,target);
    }
}
