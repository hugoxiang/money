package com.essexlg.money;

public class Sum implements Expression {
    public Money augend;
    public Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    @Override
    public Money reduce(String to) {
        final int amount = addend.amount + augend.amount;
        return new Money(amount, to);
    }
}
