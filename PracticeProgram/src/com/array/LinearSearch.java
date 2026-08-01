package com.array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter Elements of Array: ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println("Enter searching element: ");
        int key=sc.nextInt();

        boolean flag=false;
        for(int i=0;i<size;i++)
        {
            if(arr[i]==key)
            {
                System.out.println("Key found at"+i+" index");
                flag=true;
                break;
            }
        }
        if(false)
        {
            System.out.println("Not found");
        }

    }
}
