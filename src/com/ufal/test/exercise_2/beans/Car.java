package com.ufal.test.exercise_2.beans;

public class Car {
    private String brand;
    private String color;
    private int quantityPeople;

    private final int PEOPLE_CAPACITY = 5;

    public Car(String brand, int quantityPeople, String color) {
        this.brand = brand;
        this.quantityPeople = quantityPeople;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getQuantityPeople() {
        return quantityPeople;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", quantityPeople=" + quantityPeople +
                '}';
    }
}
