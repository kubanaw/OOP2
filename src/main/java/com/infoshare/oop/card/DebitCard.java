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
    public void pay() {
        System.out.println("Płatność kartą debetową");
    }
}
