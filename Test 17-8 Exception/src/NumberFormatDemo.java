public class NumberFormatDemo {
    public static void main(String[] args) {
        try
        {
            System.out.println(Integer.parseInt("ABC"));
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
}
