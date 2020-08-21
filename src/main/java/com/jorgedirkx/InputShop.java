package com.jorgedirkx;

import java.util.Scanner;

public class InputShop {

    private Scanner kbd;

    InputShop(){
        kbd = new Scanner(System.in);
    }

    //asking for input

    public int askChoice(){
        System.out.println("make your selection");
        int choice = kbd.nextInt();
        while (choice < 1 || choice > ComputerTypes.values().length){
            System.out.println("not an option, try again");
            choice = kbd.nextInt();
        }
        return choice;
    }
}
