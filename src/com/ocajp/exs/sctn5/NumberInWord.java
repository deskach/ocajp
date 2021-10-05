package com.ocajp.exs.sctn5;

public class NumberInWord {
    public static void printNumberInWord(int number) {
        String[] numberWords = { "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE" };
        String text = (number < 0 || number > 9) ? "other" : numberWords[number];

        System.out.println(text);
    }
}
