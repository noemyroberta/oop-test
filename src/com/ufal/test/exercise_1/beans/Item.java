package com.ufal.test.exercise_1.beans;

public class Item {
    private String name;
    private String measure;

    public Item() {

    }

    public Item(String name, String measure) {
        this.name = name;
        this.measure = measure;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", measure=" + measure +
                '}';
    }
}
