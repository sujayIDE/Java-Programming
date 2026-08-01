package com.animalsoundsystem;

public class Main {
    public static void main(String[] args) {
        Animal animal;
        animal=new Dog();
        animal.makesound();

        animal=new Cat();
        animal.makesound();

        animal=new Cow();
        animal.makesound();
    }
}
