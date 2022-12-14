package com.ufal.test.exercise_6.main;

import com.ufal.test.exercise_6.beans.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        IAccount checkingAccount = new CheckingAccount(0, 123);
        IAccount specialAccount = new SpecialAccount(250, 250, 233);

        ArrayList<IAccount> accounts = new ArrayList<>();
        accounts.add(checkingAccount);
        accounts.add(specialAccount);

        Client client = new Client("Cleyfane", accounts);

        AccountImplementation aci = new AccountImplementation();

        aci.setAccount(specialAccount);
        aci.cashOut(250);
        aci.cashOut(250);
        aci.cashIn(500);
        aci.cashOut(250);

        System.out.println();
        aci.setAccount(checkingAccount);
        aci.cashIn(250);
    }
}
