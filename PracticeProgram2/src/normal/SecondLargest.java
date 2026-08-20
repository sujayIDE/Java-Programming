package normal;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={34,2,56,89,23,1};
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                secondmax=max;
                max=arr[i];
            }
            else if(secondmax<arr[i] && arr[i]!=max )
            {
                secondmax=arr[i];
            }
        }
        System.out.println(secondmax);
    }
}
