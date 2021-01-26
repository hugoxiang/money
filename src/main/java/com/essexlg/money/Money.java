package com.essexlg.money;

public abstract class Money {
    protected final String currency;
    protected int amount;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    @Override
    public boolean equals(Object o) {
        final Money money = (Money) o;
        return amount == money.amount && getClass().equals(o.getClass());
    }

    public abstract Money times(int multiplier);

    public String currency() {
        return currency;
    }
}
