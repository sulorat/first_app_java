package com.example.first;

import java.io.Serializable;

public class User implements Serializable {
    private String email;
    private String password;

    public String Email(){
        return email;
    }
    public void Email(String email){
        this.email = email;
    }
    public String Password(){
        return password;
    }
    public void Password(String password){
        this.password = password;
    }
    public User(String email, String password){
        this.email = email;
        this.password = password;
    }
}
