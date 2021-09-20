package com.ocajp.integers;

public class ByteShortIntLong {

    public static void main(String[] args) {
        integers();
        bytes();
        shorts();
        longs();
    }

    public static void integers() {
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Maximum Value = " + (myMaxIntValue + 1));

        int myMaxIntTest = 2_147_483_647;
    }

    public static void bytes() {
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
    }

    public static void shorts() {
        short myMinSortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Minimum Value = " + myMinSortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
    }

    public static void longs() {
        long myLongValue = Integer.MAX_VALUE + 1L;

        System.out.println("My Long Value = " + myLongValue);
        System.out.println("Long Max Value = " + Long.MAX_VALUE);
        System.out.println("Long Min Value = " + Long.MIN_VALUE);
    }
}
