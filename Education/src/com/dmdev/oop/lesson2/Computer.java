package com.dmdev.oop.lesson2;

public class Computer {
    private int ssd;

    private int ram;

    public Computer() {
        System.out.println("Я был создан");
    }

    Computer(int newSsd) {
        ssd = newSsd;
    }

    Computer(int newSsd, int newRam) {
        ssd = newSsd;
        ram = newRam;
    }

    void load() {
        System.out.println("Я загрузился");
    }

    void printState() {
        System.out.println("RAM: " + ram);
        System.out.println("SSD: " + ssd);
        System.out.println();
    }
}
