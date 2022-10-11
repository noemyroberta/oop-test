package com.ufal.test.exercise_5.beans;

public class SerialBluetoothFormat extends UFALBluetooth {

    @Override
    public void connect() {
        System.out.println(">> Connecting bluetooth using serial");
    }

    @Override
    public void disconnect() {
        System.out.println(">> Closing connection bluetooth using serial");
    }

    @Override
    protected void typeOfProcess() {
        System.out.println(">> This is the different way to process bluetooth, using serial");
    }
}
