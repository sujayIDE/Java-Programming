package normal;

public class SecondSmallest {
    public static void main(String[] args) {
        int arr[]={34,2,56,89,23,1};
        int min=Integer.MAX_VALUE;
        int secondMin=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                secondMin=min;
                min=arr[i];
            } else if (secondMin>arr[i] && arr[i]!=min) {
                secondMin=arr[i];
            }
        }
        System.out.println(secondMin);
    }
}
