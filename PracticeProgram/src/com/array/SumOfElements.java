package com.array;

import java.util.Scanner;

public class SumOfElements {
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

        int sum=0;
        //print
        for(int i=0;i<size;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("Sum: "+sum);
    }
}
