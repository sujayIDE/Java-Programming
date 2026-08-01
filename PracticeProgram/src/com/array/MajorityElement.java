package com.array;

public class MajorityElement {
    static void majorityElement(int []arr)
    {
        int max=0;
        int element=0;
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
                if(count>max)
                {
                    max=count;
                    element=arr[i];
                }
            }
        }
        System.out.println(max);
        System.out.println(element);
    }
    public static void main(String[] args) {
        int[] arr={3,2,3};
        majorityElement(arr);
    }
}
