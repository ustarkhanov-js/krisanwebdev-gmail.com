package com.dmdev.oop.lesson7;

public class Computer {
    private Ram ram;

    private Ssd ssd;

    private static int counter = 0;

    public Computer(Ram ram, Ssd ssd) {
        this.ram = ram;
        this.ssd = ssd;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public void printState() {
        System.out.println("Computer: RAM " + ram.getValue() + ", SSD " + ssd.getValue());
    }
}
