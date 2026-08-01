package com.array;

public class KeepPrimeNumbers {
    static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }

        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

    static void keepPrimeNumbers(int arr[])
    {
        int left=0;
        int right=0;

        while (right<arr.length)
        {
            if(isPrime(arr[right]))
            {
                arr[left]=arr[right];
                left++;
            }
            right++;
        }
        int count=left;
        for(int i=0;i<count;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int []arr={4, 7, 8, 11, 12, 13, 15};
        keepPrimeNumbers(arr);
    }
}
