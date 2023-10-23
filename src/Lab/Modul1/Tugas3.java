package Lab.Modul1;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan kata atau kalimat: ");
        String input = scanner.nextLine();
        //menggantikan semua char dengan huruf alfabet
        //mengubah semua huruf menjadi huruf kecil
        String Input = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        if (Palindrome(Input)) {
            System.out.println("Input adalah palindrome.");
        } else {
            System.out.println("Input bukan palindrome.");
        }
        scanner.close();
    }
    public static boolean Palindrome(String kata) {
        int kiri = 0;
        int kanan = kata.length() - 1;

        while (kiri < kanan) {
            if (kata.charAt(kiri) != kata.charAt(kanan)) {
                return false;
            }
            kiri++;
            kanan--;
        }

        return true;
    }
}

