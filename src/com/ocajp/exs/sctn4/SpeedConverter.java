package com.ocajp.exs.sctn4;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609D);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");

            return;
        }

        System.out.printf("%s km/h = %d mi/h%n", String.valueOf(kilometersPerHour), toMilesPerHour(kilometersPerHour));
    }
}

class TestSpeedConverter {
    public static void main(String[] args) {
        double testCases[] = { 1.5, 10.25, -5.6, 25.42, 75.114 };

        for (double tc : testCases) {
            SpeedConverter.printConversion(tc);
        }
    }
}