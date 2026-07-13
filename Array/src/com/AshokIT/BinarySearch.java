package com.AshokIT;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the element of array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter searching element:");
        int key=sc.nextInt();

        Arrays.sort(arr);

        int low=0;
        int high=arr.length-1;


        boolean found=false;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==key)
            {
                System.out.println(key+ " found");
                found=true;
                break;
            } else if (mid<key) {
                low=mid+1;
            }else
                high=mid-1;
        }

        if(!found)
            System.out.println(key+ "Not found");
    }
}
