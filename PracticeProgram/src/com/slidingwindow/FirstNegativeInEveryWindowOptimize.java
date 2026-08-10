package com.slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class FirstNegativeInEveryWindowOptimize {
    static int firstNegative(int arr[],int k)
    {
        int left=-0;
        int right=0;
        int element=0;
        List<Integer> integerList=new ArrayList<>();
        while(right<arr.length)
        {
            if(arr[right]<0)
            {
                integerList.add(arr[right]);
            }

            if(right-left+1<k)
            {
                right++;
            } else if (right-left+1==k) {
                if(integerList.isEmpty())
                {
                    System.out.println(0);
                }else{
                    System.out.println(integerList.getFirst());
                }

                if(arr[left]<0)
                {
                    integerList.remove(0);
                }

                left++;
                right++;
            }
        }
        return element;
    }
    public static void main(String[] args) {
        int []arr={12,-1,-7,8,-16,30,16,28};
        int k=3;
        int element=firstNegative(arr,k);
        System.out.print(element+" ");
    }
}
