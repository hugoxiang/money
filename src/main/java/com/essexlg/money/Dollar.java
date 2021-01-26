package com.essexlg.money;

public class Dollar {
    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object o) {
        final Dollar dollar = (Dollar) o;
        return amount == dollar.amount;
    }
}
