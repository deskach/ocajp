package com.ocajp.classdesign;

abstract class Mammal1 {
    protected boolean hasFur() {
        return false;
    }
}

public class Capybara extends Mammal1 {
    public boolean hasFur() {
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Capybara().hasFur());
    }
}
