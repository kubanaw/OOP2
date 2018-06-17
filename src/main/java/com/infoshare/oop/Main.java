package com.infoshare.oop;

import com.infoshare.oop.card.*;
import com.infoshare.oop.exception.NotEnoughFundsException;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Card creditCard = new CreditCard("Karta kredytowa", "123",
                BigDecimal.ONE, new BigDecimal(200), CustomerType.COMPANY);
        Card debitCard = new DebitCard("Karta debetowa", "12345",
                new BigDecimal("500"), CustomerType.INDIVIDUAL);
        CanTransferTo prepaidCard = new PrepaidCard("Karta przedpłacona", "123456",
                new BigDecimal("150"), CustomerType.INDIVIDUAL, true);


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
        System.out.println(prepaidCard.toString());

        prepaidCard.transferToCard(BigDecimal.ZERO);

        CanTransferTo canTransferTo = new CanTransferTo() {
            public void transferToCard(BigDecimal amount) {
                System.out.println("Transfer to product");
            }
        };
    }
}
