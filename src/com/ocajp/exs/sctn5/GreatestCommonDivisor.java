package com.ocajp.exs.sctn5;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int number1, int number2) {
        if (number1 < 10 || number2 < 10) {
            return -1;
        }

        int min = Math.min(number1, number2);
        int max = Math.max(number1, number2);

        while (min != 0) {
            int rem = max % min;
            max = min;
            min = rem;
        }

        return max;
    }
}

class TestGreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(25, 15));
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(12, 30));
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(9, 18));
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(81, 153));
    }
}