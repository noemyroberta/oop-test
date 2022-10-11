package com.ufal.test.exercise_4.beans;

public class CreditCardPayment implements IPay {

    @Override
    public void pay() {
        System.out.println(">> Paying by Credit Card");
    }
}
