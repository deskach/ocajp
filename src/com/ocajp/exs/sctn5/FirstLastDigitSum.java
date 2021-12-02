package com.ocajp.exs.sctn5;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        String str = String.valueOf(number);
        int first = str.charAt(0) - '0';
        int last = str.charAt(str.length() - 1) - '0';

        return first + last;
    }
}
