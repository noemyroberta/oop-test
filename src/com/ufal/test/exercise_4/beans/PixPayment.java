package com.ufal.test.exercise_4.beans;

public class PixPayment implements IPay{

    private final String key;
    private final PixTypeKey typeKey;

    public PixPayment(String typeKey, String key) {
        this.key = key;

        switch(typeKey) {
            case "CELLPHONE_NUMBER":
                this.typeKey = PixTypeKey.CELLPHONE_NUMBER;
                break;
            case "CPF":
                this.typeKey = PixTypeKey.CPF;
                break;
            case "GENERATED_KEY":
                this.typeKey = PixTypeKey.GENERATED_KEY;
                break;

            default: this.typeKey = PixTypeKey.GENERATED_KEY;
        }
    }

    @Override
    public void pay() {
        if (typeKey.equals(PixTypeKey.CPF) && key.equalsIgnoreCase("782.698.878-87")) {
            System.out.println(">> Paying by PIX with CPF key");
        }

    }
}
