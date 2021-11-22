package com.ocajp.core.api;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Experiments {
    public static void test26() {
        List<Integer> ages = new ArrayList<>();
        ages.add(Integer.parseInt("5"));
        ages.add(Integer.valueOf("6"));
        ages.add(7);
        ages.add(null);
        for (Integer age : ages) {
            System.out.println(age);
        }

    }

    public static void test25() {
        List<String> hex = Arrays.asList("30", "8", "3A", "FF");
        Collections.sort(hex);
        int x = Collections.binarySearch(hex, "8");
        int y = Collections.binarySearch(hex, "3A");
        int z = Collections.binarySearch(hex, "4F");
        System.out.println(x + " " + y + " " + z);
        System.out.println(hex);
    }

    //    public static void test20() {
    //        List<String> list = new ArrayList<String>();
    //        list.add("one");
    //        list.add("two");
    //        list.add(7);
    //        for(String s : list) System.out.print(s);
    //    }

    public static void test17() {
        ArrayList l = new ArrayList();
        System.out.println(l.size());
    }

    public static void test33() {
        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        Period p = Period.ofDays(1).plusYears(2);
//                .ofYears(2);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(f.format(d));
        System.out.println(f.format(d.minus(p)));
    }

    public static void main(String[] args) {
        test33();
    }
}
