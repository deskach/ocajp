package com.ocajp.exs.sctn5;

public class NumberToWords {
    public static int getDigitCount(int number) {
        return number < 0 ? -1 : String.valueOf(number).length();
    }

    public static int reverse(int number) {
        String reversedStr = new StringBuilder(String.valueOf(Math.abs(number))).reverse().toString();
        int reversedInt = Integer.parseInt(reversedStr);

        return number < 0 ? -1 * reversedInt : reversedInt;
    }

    public static void numberToWords(int number) {
        String[] words = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };

        if (number < 0) {
            System.out.println("Invalid Value");
        }

        for (int i = getDigitCount(number); i > 0; i--) {
            int digit = (int) (number / Math.pow(10, i - 1)) % 10;

            System.out.println(words[digit]);
        }
    }
}

class TestNumberToWords {
    public static void main(String[] args) {
        testReverse();
    }

    static void testNumberToWords() {
        int[] testCases = { 123, 1010, 1000, -15 };

        for (int tc : testCases) {
            NumberToWords.reverse(tc);
        }
    }

    static void testReverse() {
        int[] testCases = { -121, 1212, 1234, 100 };

        for (int tc : testCases) {
            System.out.println(NumberToWords.reverse(tc));
        }
    }
}