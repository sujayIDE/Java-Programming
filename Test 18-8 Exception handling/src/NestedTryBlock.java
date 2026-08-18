public class NestedTryBlock {
    public static void main(String[] args) {
        try{
            try {
                System.out.println(10/0);
            }catch (ArithmeticException e)
            {
                System.out.println(e.getMessage());
            }
            int [] arr={10,20,30};
            System.out.println(arr[30]);
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
