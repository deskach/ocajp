package com.ocajp.exs.sctn5;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        int result = -1;

        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                if (number == i && result == 2 || getLargestPrime(i) == i) {
                    result = i;
                }
            }
        }

        return result;
    }
}

class TestLargestPrime {
    public static void main(String[] args) {
        int[] testCases = {4, 21, 217, 0, 45, -1 };

        for (int tc: testCases) {
            System.out.println(LargestPrime.getLargestPrime(tc));
        }
    }
}