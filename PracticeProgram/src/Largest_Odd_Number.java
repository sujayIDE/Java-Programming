public class Largest_Odd_Number {
    public static void main(String[] args) {
        int arr[]={4,3,6,9,3,2,6};
        int maxOdd=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                if(arr[i]>maxOdd)
                {
                    maxOdd=arr[i];
                }
            }
        }
        System.out.println("MaxOdd: "+maxOdd);
    }
}
