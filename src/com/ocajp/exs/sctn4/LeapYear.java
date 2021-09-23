package com.ocajp.exs.sctn4;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }

            return true;
        }

        return false;
    }
}

class TestLeapYear {
    public static void main(String[] args) {
        int[] testCases = { -1600, 1600, 2017, 2000 };

        for (int tc: testCases) {
            System.out.println(LeapYear.isLeapYear(tc));
        }
    }
}