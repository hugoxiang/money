package com.essexlg.money;

public class Money {
    protected int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        final Money money = (Money) o;
        return amount == money.amount && getClass().equals(o.getClass());
    }
}
