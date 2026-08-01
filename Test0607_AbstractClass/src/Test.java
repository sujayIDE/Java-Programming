abstract class Animal
{
    Animal()
    {
        System.out.print("Animal ");
    }
}

class Dog extends Animal
{
    Dog()
    {
        super();
        System.out.print("Dog");
    }
}


public class Test {
    public static void main(String[] args) {
        new Dog();
    }
}
