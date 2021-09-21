package com.ocajp.charbool;

public class CharBool {
    public static void main(String[] args) {
        chars();
        booleans();
    }

    /* sizeof(char) = 2 bytes to store Unicode */
    public static void chars() {
        char myChar = 'D'; // 'DD' causes syntax error
        char myCharU = '\u0044';

        System.out.printf("%c %c %c\n", myChar, myCharU, '\u00A9');
    }

    public static void booleans() {
        boolean myTrue = true;
        boolean myFalse = false;
        boolean isOver21 = true;
    }
}
