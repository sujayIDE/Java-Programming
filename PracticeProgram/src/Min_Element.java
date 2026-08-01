public class Min_Element {
    public static void main(String[] args) {
        int arr[]={4,3,6,9,3,2,6};
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
