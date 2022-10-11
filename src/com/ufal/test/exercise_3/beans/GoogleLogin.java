package com.ufal.test.exercise_3.beans;

public class GoogleLogin implements ILogin {

    private final String id;

    public GoogleLogin(String id) {
        this.id = id;
    }

    @Override
    public void signIn() {
        if (id.equalsIgnoreCase("00123")) {
            System.out.println(">> User logged in with Google account!");
        }
    }
}
