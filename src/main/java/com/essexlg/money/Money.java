package com.essexlg.money;

public abstract class Money {
    protected int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    public static Money dollar(int amount) {
        return new Dollar(amount);
    }

    public static Money franc(int amount) {
        return new Franc(amount);
    }

    @Override
    public boolean equals(Object o) {
        final Money money = (Money) o;
        return amount == money.amount && getClass().equals(o.getClass());
    }

    public abstract Money times(int multiplier);
}
