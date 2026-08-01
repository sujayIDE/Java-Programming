package com.array;

public class LinearSearch2 {
    static void search(int[]arr,int target){
        boolean flag=false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                flag=true;
                break;
            }
        }
        if(flag)
        {
            System.out.println("Found");
        }else {
            System.out.println("Not found");
        }
    }
    public static void main(String[] args) {
        int arr[]={10, 20, 30, 40};
        int target=30;
        search(arr,target);
    }
}
