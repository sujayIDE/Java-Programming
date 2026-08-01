interface Animal
{
    void sound();
}

class Dog implements Animal
{
    public void sound()
    {
        System.out.println("Bark");
    }
}

public class Test1
{
    public static void main(String[] args)
    {
        Animal a = new Dog();
        a.sound();
    }
}