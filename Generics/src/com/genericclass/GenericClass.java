package com.genericclass;

public class GenericClass <T> {
    private T name;

    public void setName(T name)
    {
        this.name=name;
    }

    public T getName()
    {
        return name;
    }
    public static void main(String[] args) {
        GenericClass<String> genericClass=new GenericClass<>();
        genericClass.setName("Rohit");
        System.out.println(genericClass.getName());
    }
}
