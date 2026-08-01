public class QuickSort {

    void swap(int arr[],int j,int idx){
        int temp=arr[j];
        arr[j]=arr[idx];
        arr[idx]=temp;
    }

    int partition(int arr[],int start,int end){
        int idx=start-1;
        int pivot=arr[end];
        for(int j=start;j<end;j++)
        {
            if(arr[j]<=pivot)
            {
                idx++;
                swap(arr,j,idx);
            }
        }
        idx++;
        swap(arr,idx,end);
        return idx;
    }

    void quicksort(int arr[],int start,int end){
        if(start<end)
        {
            int pidx=partition(arr,start,end);
            quicksort(arr,start,pidx-1);
            quicksort(arr,pidx+1,end);
        }
    }

    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        QuickSort  q=new QuickSort();
        q.quicksort(arr,0,arr.length-1);
        for(int a:arr)
        {
            System.out.print
                    (a+" ");
        }
    }
}
