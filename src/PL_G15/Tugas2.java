package PL_G15;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        while (true) {
            try {
                System.out.print("Masukkan nilai > 1 dan < 10: ");
                x = input.nextInt();
                if (x > 1 && x < 10) {
                    break;
                } else {
                    System.out.println("Nilai tidak memenuhi spesifikasi.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error. Jangan masukan nilasi selain");
                input.nextLine();
            }}

            int y = 1;
            for (int i = 1; i <= x; i++) {
                y *= i;
            }

            if (y >= 125) {
                System.out.println("Nilai faktorial (" + x + "!) adalah " + y);
                System.out.println("Nilai >= 125");

            } else {
                System.out.println("Nilai faktorial (" + x + "!) adalah " + y);
                System.out.println("Nilai <= 125");
            }

        input.close();
    }
}

