package com.dmdev.oop.lesson7;

public class Computer {
    private Ram ram;

    private Ssd ssd;

    public Computer(Ram ram, Ssd ssd) {
        this.ram = ram;
        this.ssd = ssd;
    }

    public void printState() {
        System.out.println("Computer: RAM " + ram.getValue() + ", SSD " + ssd.getValue());
    }
}
