package com.jorgedirkx;

public enum ComputerTypes {

    MACBOOK(1200), IMAC (1000), IPAD(500);

    ComputerTypes(double price){
        this.price = price;
    }

    private double price;

    public double getPrice() {
        return price;
    }
}
