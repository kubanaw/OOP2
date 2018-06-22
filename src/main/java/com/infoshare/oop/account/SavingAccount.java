package com.infoshare.oop.account;

import com.infoshare.oop.card.CustomerType;

import java.math.BigDecimal;

public class SavingAccount extends Account {

    protected BigDecimal transferFee;

    public SavingAccount (String id, String name, String number, BigDecimal transferFee) {
        super(id, name, number);
        this.transferFee = transferFee;
        System.out.println("Some constructor");
    }

    public BigDecimal getTransferFee() {
        return transferFee;
    }

    public String toString() {
        return super.toString() + " " + transferFee.toString();
    }

}
