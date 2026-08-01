package com.locker;

public class Locker {
    private int lockerNumber;
    private String password;
    private String ownerName;

    public int getLockerNumber() {
        return lockerNumber;
    }

    public void setLockerNumber(int lockerNumber) {
        this.lockerNumber = lockerNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    void verifyPassword(String enteredPassword)
    {
        if(password.equals(enteredPassword))
        {
            System.out.println("Password verification successful...");
        }else {
            System.out.println("Enter correct Password");
        }

    }

    void changePassword(String currentPassword,String newPassword)
    {
        if(password.equals(currentPassword))
        {
            currentPassword=newPassword;
            System.out.println("Password change successfully: "+currentPassword);
        }else{
            System.out.println("Current password is Incorrect...");
        }
    }

    void displayOwner()
    {
        System.out.println("Owner Name: "+ownerName);
    }
}
