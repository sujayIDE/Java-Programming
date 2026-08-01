import java.util.Arrays;

public class Continuous_Sequence {
    static void maxsequence(int []arr)
    {
        Arrays.sort(arr);
        for(int a:arr)
        {
            System.out.print(a+" ");
        }

       int i=0;
        for(int j=i+1;j<arr.length;j++)
        {
            System.out.println(i+" "+j);
        }
        System.out.println();





    }
    public static void main(String[] args) {
        int arr[]={100,4,200,1,3,2,5};
        maxsequence(arr);
    }
}
