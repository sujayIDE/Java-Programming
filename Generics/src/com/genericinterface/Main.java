package com.genericinterface;

public class Main implements MyInterface <String>{
    @Override
    public String m1(String name, String department) {
        return "Name: "+name +"\n"+
                "Department: "+department;
    }

    public static void main(String[] args) {
        Main main=new Main();
        System.out.println( main.m1("Sujay","Developer"));
    }
}
