package com.ufal.test.exercise_4.beans;

public class PayImplementation {

    private IPay typePayment;

    public PayImplementation() {

    }

    public void pay() {
        typePayment.pay();
    }

    public IPay getTypePayment() {
        return typePayment;
    }

    public void setTypePayment(IPay typePayment) {
        this.typePayment = typePayment;
    }
}
