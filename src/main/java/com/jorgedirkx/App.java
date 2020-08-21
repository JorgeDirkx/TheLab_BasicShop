package com.jorgedirkx;

public class App {

    public static void main(String[] args) {

        ComputerShop order1 = new ComputerShop(1);
        InputShop tool = new InputShop();
        int choice;

        order1.printMenu();

        for(int i =0;i<5;i++){
            choice=tool.askChoice();
            order1.getChoice(choice);
        }
        order1.printReciept();
    }
}
