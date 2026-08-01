interface C
{
    default void show()
    {
        System.out.println("A");
    }
}

class B implements C
{
}

public class Test2
{
    public static void main(String[] args)
    {
        B obj = new B();
        obj.show();
    }
}