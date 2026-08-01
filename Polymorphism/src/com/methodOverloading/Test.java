package com.methodOverloading;

public class Test {
    public static void main(String[] args) {
        UserService us=new UserService();
        User user=us.findUser(101);
       if(user!=null)
       {
           System.out.println("ID: " +user.getId());
           System.out.println("Name: "+user.getName());
           System.out.println("Email: "+user.getEmail());
       }else {
           System.out.println("User doesn't exist");
       }
    }
}
