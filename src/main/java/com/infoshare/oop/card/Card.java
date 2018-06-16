package com.infoshare.oop.card;

import java.math.BigDecimal;

public class Card {
    protected String name;
    protected String number;
    protected BigDecimal balance;

    public Card(String name, String number) {
        System.out.println("Card initialization - constructor with 2 arguments");
        this.name = name;
        this.number = number;
        this.balance = BigDecimal.ZERO;
    }

    public Card(String name, String number, BigDecimal balance) {
        this(name, number);
        this.balance = balance;
        System.out.println("Card initialization - constructor with 3 arguments");
    }

    @Override
    public String toString() {
        return name + ", " + "number: " + number + ", balance: " + balance + "zł";
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void pay(){
        System.out.println("Płatność kartą");
    }
}