package com.infoshare.oop;

import com.infoshare.oop.card.Card;
import com.infoshare.oop.card.CreditCard;
import com.infoshare.oop.card.DebitCard;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Card creditCard = new CreditCard("Karta kredytowa", "123", BigDecimal.ONE, new BigDecimal(200));
        Card debitCard = new DebitCard("Karta debetowa", "12345");

        try {
            creditCard.pay();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            debitCard.pay();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(creditCard.toString());
    }
}
