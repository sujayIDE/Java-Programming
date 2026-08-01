public class Duplicate {
    public static boolean isDuplicate(int arr[])
    {
        boolean flag=false;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[j]==arr[i])
                {
                    flag=true;
                    break;
                }
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int arr[]={101, 205, 309, 101};
        boolean result=isDuplicate(arr);
        if(result==false)
        {
            System.out.println("Not found");
        }else
            System.out.println("Found");

    }
}
