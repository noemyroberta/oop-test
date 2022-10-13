package com.ufal.test.exercise_6.beans;

import java.util.ArrayList;

public class Client {

    private String name;
    private ArrayList<IAccount> accounts;

    public Client() {

    }

    public Client(String name, ArrayList<IAccount> accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                '}';
    }
}
