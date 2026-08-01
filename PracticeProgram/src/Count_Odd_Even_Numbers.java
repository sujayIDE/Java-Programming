public class Count_Odd_Even_Numbers {
    static void countOdd(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                count++;
            }
        }
        System.out.println("Odd Count: "+count);
    }

    static void countEven(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                count++;
            }
        }
        System.out.println("Even Count: "+count);
    }
    public static void main(String[] args) {
        int arr[]={2,5,8,3,9,1,6};
        countOdd(arr);
        countEven(arr);
    }
}
