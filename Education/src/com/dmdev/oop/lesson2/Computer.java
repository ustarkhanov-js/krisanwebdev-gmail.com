package com.dmdev.oop.lesson2;

public class Computer {
    int ssd;

    int ram;

    Computer() {
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
