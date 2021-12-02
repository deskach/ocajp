package com.ocajp.practests;

import java.util.Arrays;

class Airplane {
    static int start = 2;

    final int end;

    public Airplane(int x) {
        x = 4;
        end = x;
    }

    public void fly(int distance) {
        System.out.print(end - start + " ");
        System.out.print(distance);
    }

    public static void main(String... start) {
        new Airplane(10).fly(5);
    }
}

class Weather {
    private int heatWave;

    public static void main(String... args) {
        System.out.print(new Weather().heatWave);
    }
}

class Q22 {

    public static void main(String[] args) {
        int i = new Integer(10);
        System.out.println(i);
    }
}

class Toy {
    public void play() {
        System.out.print("play-");
    }

    @Override
    public void finalize() {
        System.out.print("clean-");
    }

    public static void main(String[] fun) {
        Toy car = new Toy();
        car.play();
        System.gc();
        Toy doll = new Toy();
        doll.play();
    }
}

class NameCheck {
    public static void main(String... data) {
        String[] strs = new String[2];
        System.out.println(Arrays.toString(strs));
    }
}

class Test {
    public static void main(String[] args) {
        boolean balloonInflated = false;
        do {
            if (!balloonInflated) {
                balloonInflated = true;
                System.out.print("inflate-");
            }
        } while (!balloonInflated);
        System.out.println("done");
    }
}

