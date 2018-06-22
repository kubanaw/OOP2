package com.infoshare.oop.card;

import com.infoshare.oop.exception.NotEnoughFundsException;

import java.math.BigDecimal;

public abstract class Card extends Product{
    protected String name;
    protected String number;
    protected BigDecimal balance;
    protected CustomerType customerType;

    protected Card(String id, String name, String number, CustomerType customerType) {
        super(id);
        this.name = name;
        this.number = number;
        this.balance = BigDecimal.ZERO;
        this.customerType = customerType;
        System.out.println("Card initialization");
    }

    protected Card(String id, String name, String number, BigDecimal balance, CustomerType customerType) {
        this(id, name, number, customerType);
        this.balance = balance;
        System.out.println("Card initialization - more arguments");
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

    public void setName (String name){
        this.name = name;
    }

    public void setNumber (String number) {
        this.number = number;
    }

    public void getBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public abstract void pay() throws NotEnoughFundsException;

    @Override
    public String toString() {
        return super.toString() + getBalance().toString() + " " + getName() + getNumber() + customerType.toString();
    }


}