package com.ufal.test.exercise_4.beans;

public class BillPayment implements IPay{

    private final String code;

    public BillPayment(String code) {
        this.code = code;
    }

    @Override
    public void pay() {
        if (code.contains("-")) {
            System.out.println(">> Paying by Bill, wait until 3 days");
        }
    }
}
