public class Most_Consecutive_Repeated_Number {
    static void most_consecutive_repeated_number(int arr[]) {
        int element=arr[0];
        int count=0;
        int max=0;
        int i=0;
        for(int j=1;j<arr.length;j++)
        {
            if(arr[i]==arr[j])
            {
                count++;
            }
            else {
                count=1;
                i=j;
            }

            if(count>max)
            {
                element=arr[j];
                max=count;
            }
        }
        System.out.println("Element: "+element);
    }

    public static void main(String[] args) {
        int arr[] = {4,4,4,4,4, 3, 3, 3, 2, 2,2,2,2,2,2, 1};
        most_consecutive_repeated_number(arr);
    }
}