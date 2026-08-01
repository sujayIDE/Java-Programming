class Animal{
    void sound()
    {
        System.out.println("Animal sound");
    }

    void run()
    {
        System.out.println("Animal run");
    }
}

class Dog extends Animal{
    void sound()
    {
        System.out.println("Dog sound");
    }
}

class Cat extends Animal{
    void sound()
    {
        System.out.println("Cat Sound");
    }
}

class AnimalService{
    public void makeSound(Animal animal)
    {
        animal.sound();
        animal.run();
    }
}
public class InheritanceExample {
    public static void main(String[] args) {
//        System.out.println("Dog Object...");
//        Dog d=new Dog();
//        d.sound();
//        d.run();
//        System.out.println("============================================");
//        System.out.println("Cat Object...");
//        Cat c=new Cat();
//        c.run();
//        c.sound();
//        System.out.println("=============================================");
//        System.out.println("Animal object");
//        Animal a=new Animal();
//        a.sound();
//        a.run();
        AnimalService as=new AnimalService();
        as.makeSound(new Animal());
        System.out.println("===================");
        as.makeSound(new Dog());
        System.out.println("===================");
        as.makeSound(new Cat());

    }
}
