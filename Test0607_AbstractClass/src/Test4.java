abstract class Parent
{
    public String toString()
    {
        return "Parent";
    }
}

class Child extends Parent
{
    public String toString()
    {
        return super.toString() + " Child";
    }
}

public class Test4
{
    public static void main(String[] args)
    {
        Child c = new Child();
        System.out.println(c);
    }
}
