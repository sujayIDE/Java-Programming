package rethrow;

public class Main {
    public static void main(String[] args) {
        Demo demo=new Demo();
        try{
            demo.display();
        }catch (ArithmeticException e)
        {
            System.out.println("Handle at higher level...");
        }
    }
}
