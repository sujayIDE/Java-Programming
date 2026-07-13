package com.AshokIT;

import java.util.Scanner;

public class LinearSearch {
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

       boolean found=false;
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]==key)
           {
               System.out.println("Found");
               found=true;
               break;
           }
       }

       if(!found)
       {
           System.out.println("Not found");
       }
       }

}
