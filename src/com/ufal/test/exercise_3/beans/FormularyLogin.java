package com.ufal.test.exercise_3.beans;

import com.ufal.test.exercise_3.beans.ILogin;

public class FormularyLogin implements ILogin {

    private String username;
    private String password;

    public FormularyLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void signIn() {
        if (username.contains("@") && password.length() > 8) {
            System.out.println(">> User logged in by Formulary type!");
        }

    }
}
