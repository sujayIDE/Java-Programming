package normal;

public class PalindromeArray {
    public static void main(String[] args) {
        int arr[]={1,0,1,0,1};
        int left=0;
        int right=arr.length-1;
        boolean flag=true;
        while (left<right)
        {
            if(arr[left]!=arr[right])
            {
                flag=false;
                break;
            }
            left++;
            right--;
        }

        if(flag)
        {
            System.out.println("Palindrome...");
        }else {
            System.out.println("Not Palindrome....");
        }
    }
}
