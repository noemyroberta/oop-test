package com.ufal.test.exercise_6.beans;

public class CheckingAccount extends Account {

    protected float balance;
    private int id;

    public CheckingAccount(float balance, int id) {
        this.balance = balance;
        this.id = id;
    }

    @Override
    public void cashIn(float value) {
        balance += value;
        System.out.println("Great! Now account "+ id +" have in account $" + balance + ".");
    }


    @Override
    public boolean typeCashOut(float value) {
        if (value <= balance) {
            balance -= value;
            System.out.println("You cashed out $" + value + ", now you have $" + balance + ".");
            return true;
        }
        System.err.println("You don't have enough money to cash out.");
        return false;
    }

    @Override
    public boolean transferCash(IAccount acc, float value) {
        if (typeCashOut(value)) {
            acc.cashIn(value);
            return true;
        }
        return false;
    }

    public float getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "balance=" + balance +
                ", id=" + id +
                '}';
    }
}
