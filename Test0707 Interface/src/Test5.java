interface Printer
{
    void print();
}

class LaserPrinter implements Printer
{
    public void print()
    {
        System.out.println("Laser Printing");
    }
}

public class Test5
{
    public static void main(String[] args)
    {
        Printer p = new LaserPrinter();
        p.print();
    }
}