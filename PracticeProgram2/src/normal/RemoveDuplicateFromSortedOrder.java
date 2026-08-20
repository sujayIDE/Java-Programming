package normal;

import java.util.Arrays;

public class RemoveDuplicateFromSortedOrder {
    public static void main(String[] args) {
        int [] arr={1,1,2,2,2,3,3,4,5,5,6};
        int left=0;
        int right=0;
        while (right<arr.length)
        {
            if(arr[right]!=arr[left])
            {
                left++;
                arr[left]=arr[right];
            }
            right++;
        }
        for(int i=0;i<=left;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
