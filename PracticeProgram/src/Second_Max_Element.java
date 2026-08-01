public class Second_Max_Element {
    static void secondMax(int arr[])
    {
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                secondMax=max;
                max=arr[i];
            }else if(arr[i]!=max && arr[i]>secondMax)
            {
                secondMax=arr[i];
            }
        }
        System.out.println("SecondMax: "+ secondMax);
    }
    public static void main(String[] args) {
        int arr[]={4, 6, 1, 7, 3, 8,100,300,150};
        secondMax(arr);
    }
}
