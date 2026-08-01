public class Demo {
    public static void main(String[] args) {
        try{
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println(c);
            try
            {
                String str=null;
                System.out.println(str.length());
            }catch (ArrayStoreException ae)
            {
                System.out.println("Inner try");
            }
        }
        catch (ArithmeticException ae)
        {
            System.out.println("Not divided by zero");
        }
        catch (ArrayIndexOutOfBoundsException ne)
        {
            System.out.println("Null values");
        }
        catch (Exception e)
        {
            System.out.println("Exception block");
        }
    }
}
