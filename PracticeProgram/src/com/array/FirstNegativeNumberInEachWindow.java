package com.array;

import java.util.ArrayList;

public class FirstNegativeNumberInEachWindow {
    static void firstNegative(int[] arr,int k)
    {
        ArrayList<Integer> list=new ArrayList<>();
        int left=0;
        int right=0;
        while (right<arr.length)
        {
            if(arr[right]<0)
            {
                list.add(arr[right]);
            }
            if(right-left+1<k)
            {
                right++;
            } else if (right-left+1==k) {
                if(list.isEmpty())
                {
                    System.out.println(0);
                }else {
                    System.out.println(list.get(0));
                }

                if(arr[left]<0)
                {
                    list.removeFirst();
                }
                left++;
                right++;
            }
        }
        for(int i:list)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int []arr={12,-1,-7,8,-15,30,16};
        int k=3;
        firstNegative(arr,k);
    }
}
