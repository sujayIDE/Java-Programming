package array;

public class FrequencyOfEachElement {
    static void calculateFrequency(int [] arr){
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
                if(arr[i]==arr[j])
                {
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println(arr[i]+"->"+count);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 1, 4};
        calculateFrequency(arr);
    }
}
