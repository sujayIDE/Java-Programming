package array;

import java.util.Arrays;

public class DeleteElement {
    static void deleteElement(int [] arr, int element)
    {
        int[] newArray=new int[arr.length-1];
        int k=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==element)
            {
                continue;
            }
            else{
                newArray[k]=arr[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50};
        int element=30;
        deleteElement(arr,element);
    }
}
