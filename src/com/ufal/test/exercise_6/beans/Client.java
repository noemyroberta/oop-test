package com.ufal.test.exercise_6.beans;

public class Client {

    private String name;

    Client() {

    }

    Client(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                '}';
    }
}
