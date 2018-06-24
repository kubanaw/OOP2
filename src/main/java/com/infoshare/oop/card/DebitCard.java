package com.infoshare.oop.card;

import com.infoshare.oop.exception.NotEnoughFundsException;

import java.math.BigDecimal;

public class DebitCard extends Card {

    public DebitCard(String id, String name, String number, CustomerType customerType){
        super(id, name, number, customerType);
    }

    public DebitCard(String id, String name, String number, BigDecimal balance, CustomerType customerType){
        super(id, name, number, balance, customerType);
    }

    @Override
    public void pay() throws NotEnoughFundsException {
        if(balance.compareTo(BigDecimal.ZERO) <= 0){
            throw new NotEnoughFundsException("Niewystarczająca ilość środków do wykonania płatności kartą debetową");
        }
        System.out.println("Płatność kartą debetową");
    }
}
