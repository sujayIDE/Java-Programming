abstract class Shape
{
    Shape()
    {
        System.out.print("Shape ");
    }

    public String toString()
    {
        return "Shape";
    }

    abstract void draw();
}

class Circle extends Shape
{
    Circle()
    {
        System.out.print("Circle ");
    }

    public String toString()
    {
        return super.toString() + " Circle";
    }

    void draw()
    {
        System.out.print("Draw");
    }
}

public class Test5
{
    public static void main(String[] args)
    {
        Shape s = new Circle();

        System.out.println();
        System.out.println(s);

        s.draw();
    }
}