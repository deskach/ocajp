package com.ocajp.exs.sctn4;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");

            return;
        }

        long minutesInAYear = 1440 * 365;
        long years = minutes / minutesInAYear;
        long days = (minutes - years * minutesInAYear) / 1440;

        System.out.printf("%d min = %d y and %d d%n", minutes, years, days);
    }
}

class TestMinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        MinutesToYearsDaysCalculator.printYearsAndDays(1440);
        MinutesToYearsDaysCalculator.printYearsAndDays(1234232);
    }
}
