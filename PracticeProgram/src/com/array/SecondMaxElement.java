package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class SecondMaxElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter element");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("After sorting");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }

        int max=arr[size-1];
        for(int i=size-1;i>0;i--)
        {
            if(arr[i]!=max)
            {
                System.out.println("Second max value: "+arr[i]);
                return;
            }
        }
        System.out.println("Not exit");
    }
}
