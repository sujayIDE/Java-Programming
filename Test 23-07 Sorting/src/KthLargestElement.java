import java.util.Arrays;

public class KthLargestElement {
    static void kthLargestElement(int arr[],int k)
    {
        Arrays.sort(arr);
        System.out.println(arr[arr.length-k]);
    }
    public static void main(String[] args) {
        int arr[]={3,2,1,5,6,4};
        int k=5;
        kthLargestElement(arr,k);
    }
}
