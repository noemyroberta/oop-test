package com.ufal.test.exercise_6.beans;

public abstract class Account implements IAccount {
    protected abstract boolean typeCashOut(float value);

    @Override
    public boolean cashOut(float value) {
        return typeCashOut(value);
    }
}
