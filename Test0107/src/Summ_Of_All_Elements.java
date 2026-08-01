public class Summ_Of_All_Elements {
    public static void main(String[] args) {
        double arr[]={1.5, 2.0, 3.5};
        int n= arr.length;
        double sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        System.out.println("Sum: "+sum);
    }
}
