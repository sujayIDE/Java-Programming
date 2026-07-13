public class SmallElement {
    public static void main(String[] args) {
        int a[]={33,2,44,22,3,25};
        int smallest=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(smallest>a[i])
            {
                smallest=a[i];
            }
        }
        System.out.println(smallest);
    }

}
