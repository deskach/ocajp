package com.ocajp.exs.sctn5;

public class SumOddRange {
    public static boolean isOdd(int number) {
        if (number < 1) {
            return false;
        }

        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;

        if (end < start || start <= 0) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            sum += isOdd(i) ? i : 0;
        }

        return sum;
    }
}
