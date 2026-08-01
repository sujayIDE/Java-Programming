interface Display
{
    default void show()
    {
        System.out.print("Display ");
    }
}

class Screen implements Display
{
}

public class Test8
{
    public static void main(String[] args)
    {
        Display d = new Screen();
        d.show();
    }
}