package com.ufal.test.exercise_3.beans;

public class FacebookLogin implements ILogin{

    private final String email;

    public FacebookLogin(String email) {
        this.email = email;
    }

    @Override
    public void signIn() {
        if (email.equalsIgnoreCase("cleyfane@gmail.com")) {
            System.out.println(">> User logged in with Facebook account!");
        }
    }
}
