package com.essexlg.money;

public class Franc {
    private int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object o) {
        final Franc dollar = (Franc) o;
        return amount == dollar.amount;
    }
}
