import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[]={3,6,7,2,7};
        Arrays.sort(arr);
        System.out.println("Array of element");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        int i=0;
        for(int j=1;j<arr.length;j++)
        {
            if(arr[i]!=arr[j])
            {
                i++;
                arr[i]=arr[j];
            }
        }
        System.out.println("Array after duplicate removing: ");

        for(int k=0;k<=i;k++)
        {
            System.out.println(arr[k]+" ");
        }
    }
}
