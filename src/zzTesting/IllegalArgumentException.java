package zzTesting;

import java.util.Scanner;

public class IllegalArgumentException {


    public IllegalArgumentException() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan usia (1-100): ");
            int usia = scanner.nextInt();
            Age(usia);
            System.out.println("Usia yang dimasukkan: " + usia);
        } catch (java.lang.IllegalArgumentException e) {
            System.out.println("Salah, " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    //rentang usia
    public static void Age(int age) {
        if (age < 1 || age > 60) {
            throw new java.lang.IllegalArgumentException("Usia harus dalam rentang 1-100.");
        }
    }
}

