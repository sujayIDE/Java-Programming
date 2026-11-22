package array;

public class DeleteElementWithoutNewArray {
    static void deleteElement(int[]arr, int element)
    {
        int index=-1;

        //find index
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==element)
            {
                index=i;
                break;
            }
        }

        if(index==-1)
        {
            System.out.println("Element not found");
            return;
        }

        //shifting left
        for(int i=index;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }

        //print
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        deleteElement(arr,30);
    }
}
