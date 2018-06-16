package com.infoshare.oop.card;

import com.infoshare.oop.exception.NotEnoughFundsException;

import java.math.BigDecimal;

public class DebitCard extends Card {

    public DebitCard(String name, String number){
        super(name, number);
    }

    public DebitCard(String name, String number, BigDecimal balance){
        super(name, number, balance);
    }

    @Override
    public void pay() throws NotEnoughFundsException {
        if(balance.compareTo(BigDecimal.ZERO) <= 0){
            throw new NotEnoughFundsException("Niewystarczająca ilość środków do wykonania płatności kartą debetową");
        }
        System.out.println("Płatność kartą debetową");
    }
}
