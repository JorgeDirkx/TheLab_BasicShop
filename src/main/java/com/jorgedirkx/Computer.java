package com.jorgedirkx;

public class Computer {

    private ComputerTypes types;

    Computer(ComputerTypes types){
        this.types = types;
    }

    double priceOfComputer(){
        return this.types.getPrice();
    }

    String computerInfo(){
        return this.types.name() +"computer";
    }
}
