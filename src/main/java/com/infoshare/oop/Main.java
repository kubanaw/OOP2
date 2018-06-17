package com.infoshare.oop;

import com.infoshare.oop.card.Card;
import com.infoshare.oop.card.CreditCard;
import com.infoshare.oop.card.CustomerType;
import com.infoshare.oop.card.DebitCard;
import com.infoshare.oop.exception.NotEnoughFundsException;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Card creditCard = new CreditCard("Karta kredytowa", "123",
                BigDecimal.ONE, new BigDecimal(200), CustomerType.COMPANY);
        Card debitCard = new DebitCard("Karta debetowa", "12345", new BigDecimal("500"), CustomerType.INDIVIDUAL);

        try {
            creditCard.pay();
        } catch (NotEnoughFundsException e) {
            System.out.println(e.getMessage());
        }


        try {
            debitCard.pay();
        } catch (NotEnoughFundsException e) {
            System.out.println(e.getMessage());
        }


        System.out.println(debitCard.toString());
        System.out.println(creditCard.toString());
    }
}
