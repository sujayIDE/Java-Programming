package com.array;

public class MaxConsecutives1s {
    static void maxConsecutiveOne(int []arr)
    {
        int right=0;
        int count=0;
        int maxCount=0;
        while (right<arr.length)
        {
            if(arr[right]==1)
            {
                count++;
            } else if (arr[right]!=1) {
                maxCount=Math.max(maxCount,count);
                count=0;
            }
            right++;
        }
        System.out.println(Math.max(count,maxCount));
    }
    public static void main(String[] args) {
        int []arr={1,1,1,0,0,1,1,1,1};
         maxConsecutiveOne(arr);
    }
}
