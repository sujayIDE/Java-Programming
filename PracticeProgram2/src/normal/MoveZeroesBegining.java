package normal;

import java.util.Arrays;

public class MoveZeroesBegining {
    static void move(int[] arr)
    {
        int left=0;
        int right=0;
        while(right<arr.length)
        {
            if(arr[right]==0)
            {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
            }
            right++;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int [] arr={2,4,5,0,3,0,1};
        move(arr);
    }
}
