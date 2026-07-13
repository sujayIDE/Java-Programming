public class LargestElement {
    public static void main(String[] args) {
        int a[]={33,2,44,22,3,25};
        int largest=a[0];
        for(int i=0;i<a.length;i++){
            if(largest<a[i])
            {
                largest=a[i];
            }
        }
        System.out.println(largest);
    }
}
