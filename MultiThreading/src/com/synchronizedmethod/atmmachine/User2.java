package com.synchronizedmethod.atmmachine;

import com.synchronizedmethod.Table;
import com.synchronizedmethod.Thread1;

public class User2 extends Thread {
    Atm atm;

    public User2(Atm atm) {   //The constructors accept an object of type ATM."
        this.atm = atm;
    }

    @Override
    public void run() {
       try{
           atm.withdraw(5000);
       }catch (RuntimeException e)
       {
           System.out.println(e.getMessage());
       }
    }
}
