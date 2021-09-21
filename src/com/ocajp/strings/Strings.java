package com.ocajp.strings;

public class Strings {
    public static void main(String[] args) {
        String str = "This is a string";

        System.out.printf("str is \"%s\"\n", str);
        System.out.printf("str is \"%s\"\n", str + ", and this is more");
        System.out.printf("str is \"%s\"\n", str + " \u00a9 2019");

        String numString = "250.55";
        numString += "49.95";
        System.out.println(numString + 0.50d);
    }
}
