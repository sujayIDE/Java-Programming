class Animal
{
    void sound()
    {
        System.out.println("Animal");
    }
}

class Dog extends Animal{
    void sound()
    {
        System.out.println("Dog");
    }
}

class Cat extends Animal{
    void sound()
    {
        System.out.println();
    }
}

class AnimalService{
    void soundService(Animal animal)
    {
        animal.sound();
    }
}
public class Test {
    public static void main(String[] args) {
        AnimalService as=new AnimalService();
        as.soundService(new Dog());
        as.soundService(new Cat());
    }
}
