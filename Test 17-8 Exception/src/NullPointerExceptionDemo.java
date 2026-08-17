public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String s=null;

        try{
            s.toUpperCase();
        }catch (NullPointerException e)
        {
            System.out.println(e);
        }
    }
}
