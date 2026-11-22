package array;

public class MissingNumbers {
    static void missingNumber(int [] arr)
    {
        for(int i=1;i<7;i++)
        {
            boolean flag=false;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]==i)
                {
                    flag=true;
                    break;
                }
            }

            if(!flag)
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1, 2, 4, 5, 7};
        missingNumber(arr);
    }
}
