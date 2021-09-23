package com.ocajp.exs.sctn4;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double v1, double v2) {
        long l1 = (long) (v1 * 1000);
        long l2 = (long) (v2 * 1000);

        return l1 == l2;
    }
}

class TestDecimalComparator {
    public static void main(String[] args) {
        double[][] testCases = { { -3.1756, -3.175 }, {3.175, 3.176}, {3.0, 3.0}, {-3.123, 3.123} };

        for (double[] tc : testCases) {
            System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(tc[0], tc[1]));
        }
    }
}
