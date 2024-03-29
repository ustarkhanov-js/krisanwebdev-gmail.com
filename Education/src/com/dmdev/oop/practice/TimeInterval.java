package com.dmdev.oop.practice;

public class TimeInterval {
    private static final int SECONDS_IN_MINUTE = 60;

    private static final int MINUTES_IN_HOUR = 60;
    private int hours;

    private int minutes;

    private int seconds;

    public TimeInterval(int seconds) {
        this.hours = seconds / 3600;
        this.minutes = seconds % 3600 / 60;
        this.seconds = seconds % 3600 % 60;
    }

    public TimeInterval(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int totalSeconds() {
        return seconds + minutes * SECONDS_IN_MINUTE + hours * SECONDS_IN_MINUTE * MINUTES_IN_HOUR;
    }

    public void printTime() {
        System.out.println("h " + hours + ", m " + minutes + ", s " + seconds);
    }

    public TimeInterval sum(TimeInterval time) {
        return new TimeInterval(this.totalSeconds() + time.totalSeconds());
    }
}
