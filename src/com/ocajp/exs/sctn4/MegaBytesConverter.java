package com.ocajp.exs.sctn4;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int mb, kb;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");

            return;
        }

        kb = kiloBytes % 1024;
        mb = (kiloBytes - kb) / 1024;
        System.out.printf("%d KB = %d MB and %d KB%n", kiloBytes, mb, kb);
    }
}

class TestMegaBytesConverter  {
    public static void main(String[] args) {
        int[] testCases = { 2500, -1024, 5000 };

        for (int tc: testCases) {
            MegaBytesConverter.printMegaBytesAndKiloBytes(tc);
        }
    }
}
