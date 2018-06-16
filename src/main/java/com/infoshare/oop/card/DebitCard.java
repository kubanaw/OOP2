package com.infoshare.oop.card;

import java.math.BigDecimal;

public class DebitCard extends Card {

    public DebitCard(String name, String number){
        super(name, number);
    }

    public DebitCard(String name, String number, BigDecimal balance){
        super(name, number, balance);
    }

    @Override
    public void pay() throws Exception{
        if(balance.compareTo(BigDecimal.ZERO) <= 0){
            throw new Exception("Niewystarczająca ilość środków do wykonania płatności kartą debetową");
        }
        System.out.println("Płatność kartą debetową");
    }
}
