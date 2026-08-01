package com.array;

public class MostConsecutiveRepeatedNumber {
    static void repeatedNumber(int[]arr)
    {
        int left=0;
        int right=0;
        int element=0;
        int count=0;
        int max=0;

        while(right<arr.length)
        {
            if(arr[left]==arr[right])
            {
                right++;
            }else {
                count=right-left;

                if(count>max)
                {
                    max=count;
                    element=arr[left];
                }
                left=right;
            }
        }
        System.out.println(element);
    }
    public static void main(String[] args) {
        int nums[]={1,1,2,2,2,3,3,4};
        repeatedNumber(nums);
    }
}
