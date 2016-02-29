package com;

/**
 * Created by silaev on 1/26/16.
 */
public class User {
    public String phone;
    public String password;
    public String login;
    public String email;

    public User createValidUser (){
        User user= new User();
        user.login = "";
        user.password = "123456";
        user.phone = "+79268355733";
        user.email = "gavus@ya.ru";
        return user;
    }
}
