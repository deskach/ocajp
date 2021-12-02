package com.ocajp.exs.sctn5;

import java.util.Arrays;
import java.util.HashSet;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if (Arrays.asList(number1, number2, number3).stream().allMatch(LastDigitChecker::isValid)) {
            Integer[] lastDigits = { number1 % 10, number2 % 10, number3 % 10 };

            return new HashSet<Integer>(Arrays.asList(lastDigits)).size() < 3;
        }

        return false;
    }

    public static boolean isValid(int number) {
        return number > 9 && number < 1001;
    }
}
