package array;

import java.util.Arrays;

public class RemoveDuplicate1 {
    static void removeDuplicate(int[]arr)
    {
        int left=0;
        int right=0;
        while (right<arr.length)
        {
            if(arr[left]!=arr[right])
            {
                left++;
                arr[left]=arr[right];
            }
            right++;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr= {1,1,2,2,3,4,5,5};
        removeDuplicate(arr);
    }
}
