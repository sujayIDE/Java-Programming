import java.util.Arrays;

public class EmployeeIDSearch {
    static void search(int arr[],int searchKey)
    {
        Arrays.sort(arr);
        int low=0;
        int high=arr.length-1;
        boolean flag=false;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==searchKey)
            {
                System.out.println("Found...");
                flag=true;
                break;
            } else if (arr[mid]<searchKey) {
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        if(!flag)
        {
            System.out.println(-1);
        }
    }
    public static void main(String[] args) {
        int arr[]={101, 105 ,110  ,120 ,125, 130};
        int searchKey=115;
        search(arr,searchKey);
    }
}
