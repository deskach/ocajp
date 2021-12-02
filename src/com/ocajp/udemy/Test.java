package com.ocajp.udemy;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> mystery = new ArrayList<>();
        secret(mystery);
        System.out.println(mystery);
    }

    public static void secret(ArrayList<String> mystery) {
        mystery.add("metal");
        String str = mystery.get(0);
        int num = mystery.size();
    }
}