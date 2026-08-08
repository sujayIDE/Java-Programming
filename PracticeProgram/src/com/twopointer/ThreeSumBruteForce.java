package twopointer;

public class ThreeSumBruteForce {
    static void threeSum(int []arr,int target)
    {
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==target)
                    {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        int target=0;
        threeSum(arr,target);
    }
}
