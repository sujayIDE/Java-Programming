package com.sujay.quicksort;

public class QuickSortDemo {

    void swap(int[] arr, int i , int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    int partition(int[] arr, int start, int end) {
        int idx = start - 1;
        int pivot = arr[end];
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                idx++;
                swap(arr,j,idx);
            }
        }
        idx++;
        swap(arr,end,idx);
        return idx;
    }

    void quickSort(int[] arr, int start, int end)
    {
        if(start<end)
        {
           int pidx=partition(arr,start,end);
           quickSort(arr,start,pidx-1); //left half
           quickSort(arr,pidx+1,end); //right half
        }
    }

    public static void main(String[] args) {
        int[] arr ={5,2,6,4,1,3};
        QuickSortDemo q=new QuickSortDemo();
        q.quickSort(arr,0,arr.length-1);
        for (int a:arr)
        {
            System.out.print(a+" ");
        }
    }
}
