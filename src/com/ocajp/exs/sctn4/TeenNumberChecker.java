package com.ocajp.exs.sctn4;

public class TeenNumberChecker {
    public static boolean isTeen(int age) {
        return age > 12 && age < 20;
    }

    public static boolean hasTeen(int age1, int age2, int age3) {
        return isTeen(age1) || isTeen(age2) || isTeen(age3);
    }
}
