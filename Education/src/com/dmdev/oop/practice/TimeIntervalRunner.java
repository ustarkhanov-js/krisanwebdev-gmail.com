package com.dmdev.oop.practice;

public class TimeIntervalRunner {
    public static void main(String[] args) {
        TimeInterval tp = new TimeInterval(1, 2, 30);

        System.out.println(tp.totalSeconds());

        TimeInterval tp1 = new TimeInterval(tp.totalSeconds());

        System.out.println(tp1.totalSeconds());

        tp1.printTime();

        TimeInterval sum = tp.sum(tp1);

        sum.printTime();
    }
}
