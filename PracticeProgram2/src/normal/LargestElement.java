package normal;

public class LargestElement {
    public static void main(String[] args) {
        int arr[]={34,2,56,89,23,1};
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
