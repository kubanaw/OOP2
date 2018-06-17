package com.infoshare.oop.card;

import com.infoshare.oop.exception.NotEnoughFundsException;

import java.math.BigDecimal;

public class PrepaidCard extends Card implements CanTransferTo {

    private boolean gift;

    public PrepaidCard(String name, String number, BigDecimal balance, CustomerType customerType, boolean gift){
        super(name, number, balance, customerType);
        this.gift = gift;
    }

    @Override
    public void pay() throws NotEnoughFundsException {
        if(balance.compareTo(BigDecimal.ZERO) <= 0){
            throw new NotEnoughFundsException("Niewystarczająca ilość środków do wykonania płatności kartą przedpłaconą");
        }
        System.out.println("Płatność kartą przedpłaconą");
    }

    @Override
    public String toString(){
        return super.toString() + ", czy jest podarunkiem " + gift;
    }

    public boolean isGift(){
        return gift;
    }

    public void transferToCard(BigDecimal amount) {
        System.out.println("Doładowanie karty prepaid");
    }
}
