package com.essexlg.money;

public class Sum implements Expression {
    public Money augend;
    public Money added;

    public Sum(Money augend, Money added) {
        this.augend = augend;
        this.added = added;
    }

    @Override
    public Money reduce(String to) {
        final int amount = augend.amount + added.amount;
        return new Money(amount, to);
    }
}
