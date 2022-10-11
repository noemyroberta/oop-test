package com.ufal.test.exercise_5.beans;

public class PackageBluetoothFormat extends UFALBluetooth {

    @Override
    public void connect() {
        System.out.println(">> Connecting bluetooth based in package");
    }

    @Override
    public void disconnect() {
        System.out.println(">> Closing connection based in package");
    }

    @Override
    protected void typeOfProcess() {
        System.out.println(">> This is the different way to process bluetooth, based in package");
    }
}
