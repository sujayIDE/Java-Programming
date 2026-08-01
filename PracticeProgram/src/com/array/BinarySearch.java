package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter elements of array: ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println("Enter key: ");
        int key=sc.nextInt();

        Arrays.sort(arr);
        int low=arr[0];
        int high=arr.length-1;
        boolean found=false;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==key)
            {
                System.out.println("Key found at: "+mid+" index");
                found=true;
                break;
            } else if (mid<key) {
                low=mid+1;
            }else
                high=mid-1;

        }

        if(!found)
        {
            System.out.println("Not found");
        }



    }

}
