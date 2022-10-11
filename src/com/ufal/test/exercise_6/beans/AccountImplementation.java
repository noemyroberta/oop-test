package com.ufal.test.exercise_6.beans;

public class AccountImplementation {

    private IAccount account;

    public AccountImplementation() {

    }

    public void cashIn(float value) {
        account.cashIn(value);
    }

    public void cashOut(float value) {
        account.cashOut(value);
    }

    public void transferCash(IAccount account, float value) {
        account.transferCash(account, value);
    }

    public IAccount getAccount() {
        return account;
    }

    public void setAccount(IAccount account) {
        this.account = account;
    }


    @Override
    public String toString() {
        return "AccountImplementation{" +
                "account=" + account +
                '}';
    }
}
