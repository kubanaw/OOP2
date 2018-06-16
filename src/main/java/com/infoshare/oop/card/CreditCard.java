package com.infoshare.oop.card;

import java.math.BigDecimal;

public class CreditCard extends Card {
    private BigDecimal creditLimit;

    public CreditCard(String name, String number, BigDecimal balance, BigDecimal creditLimit) {
        super(name, number, balance);
        this.creditLimit = creditLimit;
        System.out.println("Credit card initialization");
    }

    @Override
    public String toString() {
        return super.toString() + ", limit: " + creditLimit + "zł";
    }

    @Override
    public void pay() {
        System.out.println("Płatność kartą kredytową");
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }
}
