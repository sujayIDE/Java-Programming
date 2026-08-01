public class Average_Of_All_Elements {
    public static void main(String[] args) {
        int arr[]={4,3,6,9,3,2,6};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        int avg=sum/arr.length;
        System.out.println(avg);
    }
}
