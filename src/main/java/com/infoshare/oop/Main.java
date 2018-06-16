package com.infoshare.oop;

import com.infoshare.oop.card.Card;
import com.infoshare.oop.card.CreditCard;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Card card = new Card("Karta", "1234");
        CreditCard creditCard = new CreditCard("Karta kredytowa", "123", BigDecimal.ONE, new BigDecimal(200));

        card.pay();
        creditCard.pay();
    }
}
