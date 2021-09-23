package com.ocajp.exs.sctn4;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        return (hourOfDay > -1 && hourOfDay < 25) && (hourOfDay > 22 || hourOfDay < 8) && barking;
    }
}

class TestBarkingDog {
    public static void main(String[] args) {
        class TestCase {
            boolean isBarking;

            int hour;

            TestCase(boolean isBarking, int hour) {
                this.isBarking = isBarking;
                this.hour = hour;
            }
        }

        TestCase[] testCases = { new TestCase(true, 1), new TestCase(false, 2), new TestCase(true, 8),
                new TestCase(true, -1), };

        for (TestCase tc : testCases) {
            System.out.println(BarkingDog.shouldWakeUp(tc.isBarking, tc.hour));
        }
    }
}
