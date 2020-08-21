package com.jorgedirkx;

import static java.lang.System.out;
import static java.lang.System.setOut;

public class ComputerShop {

    private Stock stock;
    private Register register;
    private static ComputerTypes[]options = ComputerTypes.values();

    ComputerShop (int amount){
        this.stock = new Stock(amount);
        this.register = new Register(amount * options.length);
    }

    public void printMenu() {
        for (ComputerTypes option : options) {
            out.println(option.ordinal() + option.name() + option.getPrice());
        }
    }

    public void getChoice(int input){
        boolean inStock = stock.checkStock(options[input-1]);
        if(inStock){
            Computer sold= stock.sellComputer(options[input-1]);
            register.addTicket(sold);
        }
    }

    public void printReciept(){
        register.printTickets();
    }

}
