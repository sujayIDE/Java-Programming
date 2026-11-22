package array;

public class FindDuplicate {
    static void findDuplicate(int[] arr )
    {
        boolean[] visited=new boolean[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            if(visited[i])
            {
                continue;
            }
            int count=0;

            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=true;
                }
            }
            if(count>1)
            {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 3, 6};
        findDuplicate(arr);
    }
}
