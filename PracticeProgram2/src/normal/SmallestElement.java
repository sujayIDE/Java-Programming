package normal;

public class SmallestElement {
    public static void main(String[] args) {
        int arr[]={34,2,56,89,23,1};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
