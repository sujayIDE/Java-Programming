interface D
{
    default void show()
    {
        System.out.print("A ");
    }
}

interface E
{
    default void show()
    {
        System.out.print("B ");
    }
}

class TestClass implements D,E
{
    public void show()
    {
        D.super.show();
        E.super.show();
    }
}

public class Test6
{
    public static void main(String[] args)
    {
        TestClass obj = new TestClass();
        obj.show();
    }
}