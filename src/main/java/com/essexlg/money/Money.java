package com.essexlg.money;

public class Money implements Expression {
    protected final String currency;
    protected int amount;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    @Override
    public boolean equals(Object o) {
        final Money money = (Money) o;
        return amount == money.amount && currency.equals(((Money) o).currency());
    }

    public String currency() {
        return currency;
    }

    @Override
    public String toString() {
        return "Money{" +
                "currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }

    public Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    public Expression plus(Money added) {
        return new Sum(this, added);
    }

    @Override
    public Money reduce(String to) {
        return this;
    }
}
