package com.synchronizedmethod.atmmachine;

public class User1 extends Thread{
    Atm atm;

    public User1(Atm atm) {
        this.atm = atm;
    }

    @Override
    public void run() {
        try {
            atm.withdraw(6000);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
