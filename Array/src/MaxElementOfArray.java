public class MaxElementOfArray {
    public static void main(String[] args) {
        int arr[]={34,22,95,32,67};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Max: "+max);
    }
}
