public class InternetUsageAnalyzer {
    public static void main(String[] args) {
        int [] arr={5, 8, 12, 6, 10, 15, 9};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int sum=0;
        double average=0;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }

            sum+=arr[i];
        }

        average=(double)sum/arr.length;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>average)
            {
                count++;
            }
        }

        System.out.println("Highest Usage       : "+max);
        System.out.println("Lowest Usage        : "+min);
        System.out.println("Average usage       : "+average);
        System.out.println("Day above average   : "+count);

    }
}
