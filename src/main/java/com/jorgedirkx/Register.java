package com.jorgedirkx;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.function.ToDoubleBiFunction;

public class Register {

    private Ticket[]tickets;
    private static int index = 0;


    public Register(int amountOfTickets) {
        tickets = new Ticket[amountOfTickets];
    }

    public double getTotalAmount(){
        double totalAmount =0;
        for (Ticket t: this.tickets){
            if(t != null){
                totalAmount +=t.givePrice();
            }
        }
        return totalAmount;
    }

    public void addTicket(Computer computer){
        tickets[index++] = new Ticket(computer);
    }

    //getting amount of ticketsmade
    public void printTicketCount(){
        int ticketsMade=0;
        for(Ticket ticket:tickets){
            if(ticket !=null){
                ticketsMade++;
            }
        }
        System.out.printf("%d tickets made", ticketsMade);
    }

    public void printTickets(){
        for(Ticket ticket: tickets){
            if(ticket!=null){
                ticket.printTicket();
            }
        }
        this.printTicketCount();
        System.out.printf("the total of sales: %.2f", this.getTotalAmount());
    }

}
