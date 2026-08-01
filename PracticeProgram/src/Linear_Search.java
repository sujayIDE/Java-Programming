public class Linear_Search {
    static void search(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                System.out.println("Found");
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,3,6,9,3,2,6};
        int key=9;
        search(arr,key);
    }
}
