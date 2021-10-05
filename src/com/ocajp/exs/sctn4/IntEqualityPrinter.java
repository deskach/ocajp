package com.ocajp.exs.sctn4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class IntEqualityPrinter {
    public static void printEqual(int arg1, int arg2, int arg3) {
        List<Integer> integers = Arrays.asList(arg1, arg2, arg3);

        for (int arg: integers) {
            if (arg < 0) {
                System.out.println("Invalid Value");

                return;
            }
        }

        if (new HashSet<>(integers).size() == 1) {
            System.out.println("All numbers are equal");

            return;
        } else if (new HashSet<>(integers).size() == integers.size()) {
            System.out.println("All numbers are different");

            return;
        }

        System.out.println("Neither all are equal or different");
    }
}

class IntEqualityPrinter1 {
    public static void printEqual(int arg1, int arg2, int arg3) {
        List<Integer> integers = Arrays.asList(arg1, arg2, arg3);

        if (integers.stream().anyMatch(a -> a < 0)) {
            System.out.println("Invalid Value");
        } else if (new HashSet<>(integers).size() == 1) {
            System.out.println("All numbers are equal");
        } else if (new HashSet<>(integers).size() == integers.size()) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}

class TestIntEqualityPrinter {
    public static void main(String[] args) {
        int[][] testCases = { { 1, 1, 1 }, { 1, 1, 2 }, { 1, -1, 1 }, { 1, 2, 3 }, {-1, -1, -1} };

        for (int[] tc:  testCases) {
            IntEqualityPrinter.printEqual(tc[0], tc[1], tc[2]);
        }
    }
}
