package com.ocajp.exs.sctn5;

import java.util.Arrays;
import java.util.HashSet;

public class SharedDigit {
    public static boolean hasSharedDigit(int number1, int number2) {
        if (number1 > 99 || number1 < 10 || number2 > 99 || number2 < 10) {
            return false;
        }

        Integer[] digits = {number1 / 10, number1 % 10, number2 / 10, number2 % 10};

        return new HashSet<Integer>(Arrays.asList(digits)).size() < digits.length;
    }
}
