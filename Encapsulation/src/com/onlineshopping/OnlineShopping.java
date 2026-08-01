package com.onlineshopping;

public class OnlineShopping {
    private String username;
    private String password;
    private int walletBalance;
    private boolean accountLocked;
    private int failedLoginAttempt;

    public OnlineShopping(String username, String password, int walletBalance, boolean accountLocked, int failedLoginAttempt) {
        this.username = username;
        this.password = password;
        this.walletBalance = walletBalance;
        this.accountLocked = accountLocked;
        this.failedLoginAttempt = failedLoginAttempt;
    }

    boolean login(String userusername,String userpassword)
    {
        if(userusername.equals(username) && userpassword.equals(password))
        {
            return true;
        }else
        {
            failedLoginAttempt++;
            System.out.println("Invalid username password..."+failedLoginAttempt);

            if(failedLoginAttempt>=3)
            {
                accountLocked=true;
            }
        }
        return false;
    }

    void addMoney(int amount)
    {
        if(amount<=0)
        {
            System.out.println("Enter valid amount...");
            return;
        }
        walletBalance+=amount;
        System.out.println("Amount add to wallet...");
    }

    void buyProduct(int amount)
    {
        if(amount>walletBalance)
        {
            System.out.println("Insufficient Fund...");
            return;
        }
        walletBalance-=amount;
    }

    void changePassword(String userPassword,String newPassword)
    {
        userPassword=newPassword;
        System.out.println("Password change...");
        return;
    }

    void viewWallet()
    {
        System.out.println("WalletBalance: "+walletBalance);
    }

    boolean isLocked()
    {
       return accountLocked;
    }
}
