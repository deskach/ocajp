package com.ocajp.floats;

public class Floats {
    public static void main(String[] args) {
        floats();
        doubles();
    }

    private static void floats() {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Min" + myMinFloatValue);
        System.out.println("Max" + myMaxFloatValue);
        System.out.println(5f / 3);
    }

    private static void doubles() {
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Min" + myMinDoubleValue);
        System.out.println("Max" + myMaxDoubleValue);
        System.out.println(5d / 3);
    }
}
