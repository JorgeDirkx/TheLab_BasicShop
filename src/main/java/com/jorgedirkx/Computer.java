package com.jorgedirkx;

public class Computer {

    private ComputerTypes types;

    Computer(ComputerTypes types){
        this.types = types;
    }

    double priceOfDonut(){
        return this.types.getPrice();
    }

    String donutInfo(){
        return this.types.name() +"computer";
    }
}
