package com.ufal.test.exercise_3.beans;

public class iCloudLogin implements ILogin {

    private final String appleAccount;

    public iCloudLogin(String appleAccount) {
        this.appleAccount = appleAccount;
    }

    @Override
    public void signIn() {
        if (appleAccount.equalsIgnoreCase("00x33")) {
            System.out.println(">> User logged in with iCloud account!");
        }
    }
}
