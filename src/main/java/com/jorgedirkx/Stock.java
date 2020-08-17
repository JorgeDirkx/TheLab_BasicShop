package com.jorgedirkx;

public class Stock {

    private int[] computerAmount;
    private static ComputerTypes[] options = ComputerTypes.values();

    public Stock(int amount) {
        this.initStock(amount);
    }

    //initial values
    public void initStock(int amount) {
        computerAmount = new int[options.length];
        for (int i = 0; i < options.length; i++) {
            this.computerAmount[i] = amount;
        }
    }

    //checking stock
    public boolean checkStock(ComputerTypes types) {
        for (int i = 0; i < options.length; i++) {
            if (types.equals(options[i]) && this.computerAmount[i] != 0) {
                return true;
            }
        }
        return false;
    }

    //selling a computer
    public Computer sellComputer(ComputerTypes types) {
        Computer sold = null;
        for(int i =0; i<options.length; i++){
            if(types.equals(options[i])){
                sold = new Computer(options[i]);
                this.computerAmount[i]--;
            }
        }
        return sold;
    }

}
