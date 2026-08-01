interface Payment
{
    void pay();
}

class UPI implements Payment
{
    public void pay()
    {
        System.out.println("UPI Payment");
    }
}

public class Test7
{
    public static void main(String[] args)
    {
        Payment p = new UPI();
        System.out.println(p instanceof Payment);
    }
}