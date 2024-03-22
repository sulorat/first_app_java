package com.example.first;

import java.io.Serializable;

public class User implements Serializable {
    private String email;
    private String password;

    public String Email(){
        return email;
    }
    public String Password(){
        return password;
    }
    public User(String email, String password){
        this.email = email;
        this.password = password;
    }
}
