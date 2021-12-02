package com.ocajp.exs.sctn5;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        StringBuilder sb = new StringBuilder(String.valueOf(Math.abs(number)));
        sb.reverse();

        return sb.toString().equals(String.valueOf(Math.abs(number)));
    }
}

class TestNumberPalindrome {
    public static void main(String[] args) {
        System.out.println(NumberPalindrome.isPalindrome(-1221));
        System.out.println(NumberPalindrome.isPalindrome(707));
        System.out.println(NumberPalindrome.isPalindrome(11212));
    }
}
