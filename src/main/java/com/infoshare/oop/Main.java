package com.infoshare.oop;

import com.infoshare.oop.account.Account;
import com.infoshare.oop.account.SavingAccount;
import com.infoshare.oop.card.*;
import com.infoshare.oop.exception.NotEnoughFundsException;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Card creditCard = new CreditCard("1234","Karta kredytowa", "123",
                BigDecimal.ONE, new BigDecimal(200), CustomerType.COMPANY);
        Card debitCard = new DebitCard("1234", "Karta debetowa", "12345",
                new BigDecimal("500"), CustomerType.INDIVIDUAL);
        Card prepaidCard = new PrepaidCard("123","Karta przedpłacona", "123456",
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

        //prepaidCard.transferToCard(BigDecimal.ZERO);

        CanTransferTo canTransferTo = new CanTransferTo() {
            public void transferToCard(BigDecimal amount) {
                System.out.println("Transfer to product");
            }
        };

        Account account = new Account("123456", "Kuba", "3");

        SavingAccount savingAccount = new SavingAccount("123456", "Kuba", "4", BigDecimal.valueOf(123456));

        ArrayList<Product> myList = new ArrayList<Product>();
        myList.add(0, debitCard);
        myList.add(1, creditCard);
        myList.add(2, prepaidCard);
        myList.add(3, account);
        myList.add(4, savingAccount);

        for (Product p:myList) {
            System.out.println(p.toString());

        }
    }
}
