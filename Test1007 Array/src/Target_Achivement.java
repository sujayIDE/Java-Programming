public class Target_Achivement {
    public static void target_achivement(int arr[],int k)
    {
            int count=0;
            for(int i=0;i<arr.length-1;i++)
            {
                for(int j=i+1;j< arr.length;j++)
                {
                    if(arr[i]+arr[j]==k)
                    {
                        System.out.println(arr[i]+" "+arr[j]);
                        count++;
                        break;

                    }
                }
            }

        System.out.println("Count: "+count);
    }
    public static void main(String[] args) {
        int arr[]={1, 1, 1};
        int k=2;
        target_achivement(arr,k);
    }
}
