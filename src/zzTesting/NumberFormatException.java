package zzTesting;

import java.util.Scanner;


public class NumberFormatException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan angka: ");
            String input = scanner.nextLine();
            int angka = Integer.parseInt(input);
            System.out.println("Anda memasukkan angka: " + angka);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Input bukan angka.");
        } finally {
            scanner.close();
        }
    }
}




