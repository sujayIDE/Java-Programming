package com.sujay.main;

import com.sujay.exception.InvalidAmountException;
import com.sujay.service.AccountService;

public class Main {
    public static void main(String[] args) {
        AccountService accountService=new AccountService(30000);
        try
        {
            accountService.deposit(-4000);
        }catch (InvalidAmountException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
