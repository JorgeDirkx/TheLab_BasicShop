package com.jorgedirkx;

public class ComputerShop {

    private Stock stock;
    private Register register;
    private static ComputerTypes[]options = ComputerTypes.values();

    ComputerShop (int amount){
        this.stock = new Stock(amount);
        this
    }


}
