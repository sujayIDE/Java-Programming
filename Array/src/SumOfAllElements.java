public class SumOfAllElements {
    public static void main(String[] args) {
        int a[]={33,2,44,22,3,25};
        int sum=0;
        for (int i=0;i<a.length;i++)
        {
            sum+=a[i];
        }
        System.out.println("Sum:"+sum);
    }
}
