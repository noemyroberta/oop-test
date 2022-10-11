package com.ufal.test.exercise_5.beans;

public class BluetoothImplementation {

    private IBluetooth bluetooth;

    public BluetoothImplementation() {

    }

    public void connect() {
        bluetooth.connect();
    }

    public void process() {
        bluetooth.process();
    }

    public void disconnect() {
        bluetooth.disconnect();
    }

    public IBluetooth getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(IBluetooth bluetooth) {
        this.bluetooth = bluetooth;
    }
}
