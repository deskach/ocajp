package com.ocajp.exs.sctn5;

//public class EvenDigitSum {
//    public static int getEvenDigitSum(int number) {
//        if (number < 0) {
//            return -1;
//        }
//
//        return String.valueOf(number).chars().map(ch -> ch - '0').filter(i -> i % 2 == 0).reduce(0, Integer::sum);
//    }
//}

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            int rem = number % 10;
            sum += rem % 2 == 0 ? rem : 0;
            number /= 10;
        }

        return sum;
    }
}

class TestEvenDigitSum {
    public static void main(String[] args) {
        System.out.println(EvenDigitSum.getEvenDigitSum(123456789));
        System.out.println(EvenDigitSum.getEvenDigitSum(252));
        System.out.println(EvenDigitSum.getEvenDigitSum(-22));
    }
}