package com.synchronizedmethod.atmmachine;

public class Main {
    public static void main(String[] args) {
        Atm atm=new Atm();

        User1 thread1=new User1(atm);
        User2 thread2=new User2(atm);

        thread1.start();
        thread2.start();
    }

}
