package com.array;

public class DuplicateElement {
    static boolean duplicate(int []arr)
    {
        boolean flag=false;
        for(int i=0; i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    flag=true;
                    break;
                }
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int[] arr={101, 205, 309, 101};
       boolean result= duplicate(arr);
        System.out.println(result);
    }
}
