import java.util.Arrays;

public class RemoveDuplicates {
    static void removeDuplicate(int arr[])
        {
            Arrays.sort(arr);
            int i=0;
            for(int j=1;j<arr.length;j++)
            {
                if(arr[i]!=arr[j])
                {
                    i++;
                    arr[i]=arr[j];
                }
            }

            for(int k=0;k<=i;k++)
            {
                System.out.println(arr[k]);
            }
        }
    public static void main(String[] args) {
        int arr[]={4,1,3,4,2,1};
        removeDuplicate(arr);
    }
}
