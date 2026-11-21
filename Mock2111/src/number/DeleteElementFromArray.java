//package number;
//
//import java.util.Arrays;
//
//public class DeleteElementFromArray {
//    static void deleteElement(int[] arr,int element)
//    {
//        int left=0;
//        int right=0;
//        while (right<=arr.length)
//        {
//            if(arr[right]==element)
//            {
//                arr[right+1]=arr[right];
//            }
//            right++;
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,6};
//        int element=2;
//        deleteElement(arr,element);
//    }
//}
