package com.infoshare.oop.card;

public enum CustomerType {
    COMPANY("Firma"),
    INDIVIDUAL("Klient indywidualny");

    private final String name;

    CustomerType(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
