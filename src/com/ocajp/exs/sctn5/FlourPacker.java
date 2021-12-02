package com.ocajp.exs.sctn5;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0 || bigCount * 5 + smallCount < goal) {
            return false;
        }

        int bigNeeded = Math.min(goal / 5, bigCount);

        return goal - bigNeeded * 5 <= smallCount;
    }
}
