public class PeakElement {
    public static void main(String[] args) {
        int arr[]={3,4,8,9,0};
        boolean flag=true;
        for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
            {
                System.out.println(arr[i]);
                flag=false;
                break;
            }
        }

        if(flag)
        {
            System.out.println("Sorry there is no peak element");
        }
    }
}
