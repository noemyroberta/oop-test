package com.ufal.test.exercise_5.beans;

public abstract class UFALBluetooth implements IBluetooth {
    protected abstract void typeOfProcess();

    @Override
    public void process() {
        typeOfProcess();
    }
}
