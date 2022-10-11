package com.ufal.test.exercise_4.main;

import com.ufal.test.exercise_4.beans.*;

public class Main {

    public static void main(String[] args) {
        PayImplementation payImpl = new PayImplementation();

        IPay pix = new PixPayment("CPF", "782.698.878-87");
        IPay creditCard = new CreditCardPayment();
        IPay bill = new BillPayment("789755c--87c8a8aabb-");

        payImpl.setTypePayment(pix);
        payImpl.pay();

        payImpl.setTypePayment(creditCard);
        payImpl.pay();

        payImpl.setTypePayment(bill);
        payImpl.pay();
    }

}
