public class ClassCastExceptionDemo{
    public static void main(String[] args) {
       try
       {
           Object obj=100;

           String s=(String) obj;

           System.out.println(s);
       }catch (ClassCastException e)
       {
           System.out.println(e);
       }
    }
}
