public class LargestElement {
    public static void main(String[] args) {
        int arr[]={12, 45, 2, 67, 31};
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Largest element: "+max);
    }
}
