package com.ufal.test.exercise_6.beans;

public class SpecialAccount extends CheckingAccount {

    private float limit;

    public SpecialAccount(float balance, float limit, int id) {
        super(balance, id);
        this.limit = limit;
    }

    public float getLimit() {
        return limit;
    }

    @Override
    public boolean typeCashOut(float value) {
        if (value <= (balance + limit)) {
            float newBalance = balance -= value;

            if (newBalance < 0) {
                limit += balance;
                balance = 0;
            }

            System.out.println("You cashed out $" + value +
                    ", now you have $" + balance +
                    " in balance and limit of $" + limit);
            return true;
        }

        System.err.println("You don't have enough limit or money to cash out.");
        return false;
    }
}
