public class PeakElement {

    public void peakElement(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length-2;i++)
        {
            if(arr[i]<arr[i+1] && arr[i+1]>arr[i+2])
            {
                System.out.println("peak Element: "+arr[i+1]);
                return;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={1, 2, 4, 5, 7, 8, 3};
        int arr1[]={10, 20, 15, 2, 23, 90, 80};
        PeakElement pe=new PeakElement();
        pe.peakElement(arr);
        pe.peakElement(arr1);

    }
}
