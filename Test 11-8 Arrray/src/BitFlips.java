import java.util.Arrays;

public class BitFlips {
    static void bitFlip(int[]arr,int k)
    {
        int i=0;
        int count=0;
           for(int j=0;j<arr.length;j++)
           {
               if(arr[i]==0)
               {
                   arr[i]=1;
                   count++;
               }
               i++;
           }
        System.out.println("Flip : "+count);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[]arr={0,1,0};
        int k=1;
        bitFlip(arr,k);
    }
}
