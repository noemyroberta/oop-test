package com.ufal.test.exercise_6.beans;

public interface IAccount {
    public boolean cashOut(float value);
    public void cashIn(float value);
    public boolean transferCash(IAccount account, float value);
}
