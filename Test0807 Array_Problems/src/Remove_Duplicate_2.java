public class Remove_Duplicate_2 {
    static void remove_duplicate(int arr[])
    {
        boolean flag=false;
        for(int i=0;i<arr.length;i++)
        {

            for(int j=0;j<=i;j++)
            {
                if(arr[i]==arr[j])
                {
                    flag=true;
                    break;
                }
            }
        }

        if(false)
        {
            System.out.println("Not duplicate");
        }else {
            System.out.println("Duplicate");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        remove_duplicate(arr);
    }
}
