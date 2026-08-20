package normal;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={34,2,56,89,23,1};
        int k=0;

        boolean flag=false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==k)
            {
                System.out.println("Found at : "+i);
                flag=true;
                break;
            }
        }
        if(!flag)
        {
            System.out.println("Not found");
        }
        }
    }

