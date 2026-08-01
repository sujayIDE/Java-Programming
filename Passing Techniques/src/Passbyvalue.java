public class Passbyvalue {
   static void m1(String str)
    {
        str=str.toUpperCase();
        System.out.println(str);
    }
    public static void main(String[] args) {
        String str="hello";
        m1(str);
        System.out.println(str);
    }
}
