package com.methodOverloading;

public class UserService {
    public User findUser(int id)
    {
        if(id==101)
        {
            User user=new User();
            user.setId(101);
            user.setName("Sujay");
            user.setEmail("sujay@gmail.com");
            return user;
        }
        return null;
    }

    public User findUser(String email)
    {
        if(email.equals("ajay@gamil.com"))
        {
            User user=new User();
            user.setId(102);
            user.setName("Ajay");
            user.setEmail("ajay@gamil.com");
            return user;
        }
        return null;
    }
}
