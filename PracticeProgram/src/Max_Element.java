public class Max_Element {
    public static void main(String[] args) {
        int arr[]={4,3,6,9,3,2,6};
        int max=Integer.MIN_VALUE;
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
