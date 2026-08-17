public class ArrayIndexOutOfBoundDemo {
    public static void main(String[] args) {
        int[]arr={2,3,4,5};

        try
        {
            System.out.println(arr[5]);
        }catch (ArrayStoreException e)
        {
            System.out.println(e);
        }
    }
}
