package com.ocajp.classdesign;

class Mammal {
    public Mammal(int age) {
        System.out.print("Mammal");
    }
}

class Platypus extends Mammal {
    public Platypus() {
        super(0);
        System.out.print("Platypus");
    }

    public static void main(String[] args) {
        new Mammal(5);
    }
}

interface Nocturnal {
    default boolean isBlind() {
        return true;
    }
}

class Owl implements Nocturnal {
    public boolean isBlind() {
        return false;
    }

    public static void main(String[] args) {
        Nocturnal nocturnal = (Nocturnal) new Owl();
        System.out.println(nocturnal.isBlind());
    }
}

abstract class Bird {
    private void fly() {
        System.out.println("Bird is flying");
    }

    public static void main(String[] args) {
        Bird bird = new Pelican();
        bird.fly();
    }
}

class Pelican extends Bird {
    protected void fly() {
        System.out.println("Pelican is flying");
    }
}

public class Experiments {
    public static void main(String[] args) {
        int x = 0;
        while(++x < 5) { x+=1; }
        String message = x > 5 ? "Greater than" : "Less Than";
        System.out.println(message+","+x);
    }
}
