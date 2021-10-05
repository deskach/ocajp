package com.ocajp.exs.sctn4;

public class AreaCalculator {
    public static double area(double radius) {
        return radius < 0 ? -1.0 : Math.PI * Math.pow(radius, 2);
    }

    public static double area(double x, double y) {
        return (x < 0 || y < 0) ? -1 : x * y;
    }
}

class TestAreaCalculator {
    public static void main(String[] args) {
        System.out.println(AreaCalculator.area(2.0, 3.0));
        System.out.println(AreaCalculator.area(2.0));
    }
}
