package com.jorgedirkx;

import java.time.LocalDateTime;

public class Ticket {

    private Computer computerSold;
    private Double price;
    private LocalDateTime date;

    public Ticket(Computer sold){
        this.computerSold = sold;
        this.price= sold.priceOfComputer();
        date = LocalDateTime.now();
    }

    public void printTicket(){
        System.out.println(this.date.getDayOfMonth());
        System.out.println(this.computerSold.computerInfo());
    }

    public double givePrice(){
        return this.price;
    }
}
