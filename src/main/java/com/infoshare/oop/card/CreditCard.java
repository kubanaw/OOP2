package com.infoshare.oop.card;

import com.infoshare.oop.exception.NotEnoughFundsException;

import java.math.BigDecimal;

public class CreditCard extends Card {
    private final BigDecimal creditLimit;

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
    public void pay() throws NotEnoughFundsException {
        if(balance.compareTo(BigDecimal.ZERO) <= 0){
            throw new NotEnoughFundsException("Niewystarczająca ilość środków do wykonania płatności kartą kredytową");
        }
        System.out.println("Płatność kartą kredytową");
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }
}
