package patterns.slidingwindow;

public class MaximumAverageSubArray {
    static double maxAverage(int arr[],int k){
        int left=0;
        int right=0;
        int sum=0;
        double avg=0;
        double maxAvg=Integer.MIN_VALUE;
        while(right<arr.length)
        {
            sum+=arr[right];
            if(right-left+1<k)
            {
                right++;
            } else if (right-left+1==k) {
                avg=(double) sum/k;
                maxAvg=Math.max(avg,maxAvg);
                sum-=arr[left];
                left++;
                right++;
            }
        }
        return maxAvg;
    }
    public static void main(String[] args) {
        int[]arr={1,12,-5,-6,50,3};
        int k=4;
        double result=maxAverage(arr,k);
        System.out.println(result);
    }
}
