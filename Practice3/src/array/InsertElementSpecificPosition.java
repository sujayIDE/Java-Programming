package array;

import java.util.Arrays;

public class InsertElementSpecificPosition {
    static void insertElement(int [] arr,int element,int position)
    {
        int[] newArray=new int[arr.length+1];
        int k=0;

        for(int i=0;i<arr.length;i++)
        {
           if(i<position)
           {
               newArray[k]=arr[i];
               k++;
           }
           else{
               newArray[position]=element;
               newArray[i+1]=arr[i];
           }
        }
        System.out.println(Arrays.toString(newArray));
    }
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50};
        int element = 25;
        int position = 2;
        insertElement(arr,element,position);
    }
}
