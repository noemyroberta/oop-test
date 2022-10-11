package com.ufal.test.exercise_5.main;

import com.ufal.test.exercise_5.beans.*;

public class Main {

    public static void main(String[] args) {
        BluetoothImplementation bluetoothImplementation = new BluetoothImplementation();

        IBluetooth serialType = new SerialBluetoothFormat();
        IBluetooth packageType = new PackageBluetoothFormat();

        bluetoothImplementation.setBluetooth(packageType);

        bluetoothImplementation.connect();
        bluetoothImplementation.process();
        bluetoothImplementation.disconnect();

        System.out.println("");
        bluetoothImplementation.setBluetooth(serialType);
        bluetoothImplementation.connect();
        bluetoothImplementation.process();
        bluetoothImplementation.disconnect();
    }
}
