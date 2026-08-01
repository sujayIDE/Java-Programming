import java.util.Arrays;

public class Missing_Locker_Number {
    public static void missing_locker_number(int arr[])
    {
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++)
        {
           if(arr[i]<0)
           {
               continue;
           }
           else if(arr[i+1]-arr[i]>1)
           {
               System.out.println("Missing: "+(arr[i]+1));
           }
        }
    }
    public static void main(String[] args) {
        int arr[]={3, 4, -1, 1};
        missing_locker_number(arr);
    }
}
