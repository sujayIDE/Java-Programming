public class MinimizeMaximumSum {
    static void minimizeMaximizeSum(int [] arr)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Max : "+max);

        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println("Total Sum : "+sum);

        int left=max;
        int right=sum;

        int mid=(left+right)/2;
        int currentSum=0;
        int truck=1;
        for(int i=0;i<arr.length;i++)
        {
            if(currentSum+arr[i]<=mid)
            {
                currentSum+=arr[i];
            }else {
                truck++;
                currentSum=arr[i];
            }
        }
        System.out.println(currentSum);

    }
    public static void main(String[] args) {
        int [] packages={7, 2, 5, 10, 8};
        minimizeMaximizeSum(packages);
    }
}
