package com.arrayClassProblem.arraystatastic;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] arr={12,15,9,18,30,21};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int even=0;
        int odd=0;
        int sum=0;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }

            if(arr[i]<min)
            {
                min=arr[i];
            }

            if(arr[i]%2==0)
            {
                even++;
            }else {
                odd++;
            }

            sum+=arr[i];

        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
        System.out.println("average: "+sum/arr.length);
    }
}
