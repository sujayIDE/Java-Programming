package rethrow;

public class Demo {
    void display()
    {
        try{
            System.out.println(5/0);
        }catch (ArithmeticException e)
        {
            System.out.println("Partially handled");
            throw new ArithmeticException();
        }
    }
}
