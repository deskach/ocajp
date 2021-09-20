package com.ocajp.hello;

public class Hello {
    public static void main(String[] args) {
        helloWorld();
        variables();
    }

    private static void helloWorld() {
        System.out.println("Hello World!");
    }

    private static void variables() {
        int my1stNumber = 35;
        int my2ndNumber = my1stNumber * 2;
        int my3rdNumber = 6;
        int myTotal = my2ndNumber + my3rdNumber;
        int myLastOne = myTotal - 1000;

        System.out.println("myTotal = " + myTotal);
        System.out.println("myLastOne = " + myLastOne);
    }
}
