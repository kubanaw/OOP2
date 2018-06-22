package com.infoshare.oop.account;

import com.infoshare.oop.card.Product;

public class Account extends Product {

    protected String name;
    protected String number;

    public Account (String id, String name, String number){
        super(id);
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String toString() {
        return super.toString() +  " " + id.toString() + " " + name.toString() + " " + number.toString();
    }

}

