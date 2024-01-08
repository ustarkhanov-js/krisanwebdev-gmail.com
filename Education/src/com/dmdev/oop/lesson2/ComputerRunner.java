package com.dmdev.oop.lesson2;

public class ComputerRunner {
    public static void main(String[] args) {
        Computer computer = new Computer(2048);

        computer.printState();

        Computer computer1 = new Computer();

        computer1.printState();

        Computer computer2 = new Computer(1025, 3330);

        computer2.printState();
    }
}
