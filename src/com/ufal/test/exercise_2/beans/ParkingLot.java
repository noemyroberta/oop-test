package com.ufal.test.exercise_2.beans;

import java.util.ArrayList;

public class ParkingLot {
    private final ArrayList<Car> cars = new ArrayList<Car>();

    public void addCar(Car car) {
        cars.add(car);

        System.out.println("Car " + car.getBrand() + " with color " + car.getColor() + " at the park.");
    }

    public void allPeople() {
        int allPeople = 0;
        for (Car c : cars) {
            allPeople += c.getQuantityPeople();
        }

        System.out.println("There is "+ allPeople + " people located.");
    }

    public void showCars() {
        System.out.println("Cars at the parking lot:");
        for (Car c : cars) {
            System.out.println(c.getBrand() + " with color " + c.getColor());
        }
    }

}
