package com.ufal.test.exercise_2.main;

import com.ufal.test.exercise_2.beans.Car;
import com.ufal.test.exercise_2.beans.ParkingLot;

public class Main {

    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.addCar(new Car("fiat", 4, "blue"));
        parkingLot.addCar(new Car("toro", 2, "red"));
        parkingLot.addCar(new Car("paraty", 3, "black"));

        parkingLot.allPeople();
        parkingLot.showCars();
    }
}
