package zzTesting;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Menampilkan pesan untuk meminta input
        System.out.println("Masukkan kata atau kalimat yang ingin dicek:");

        // Menerima input dari pengguna dan menyimpannya dalam variabel input
        String input = scanner.nextLine();

        // Menutup objek Scanner
        scanner.close();

        // Memanggil metode isPalindrome untuk mengecek apakah input adalah palindrome atau tidak
        boolean result = isPalindrome(input);

        // Menampilkan hasil pengecekan
        if (result) {
            System.out.println("Input Anda adalah palindrome.");
        } else {
            System.out.println("Input Anda bukan palindrome.");
        }
    }

    // Metode untuk mengecek apakah sebuah string adalah palindrome atau tidak
    public static boolean isPalindrome(String s) {
        // Menghapus spasi, huruf kapital, dan tanda baca dari string
        s = s.replaceAll("\\s+", "") // menghapus spasi
                .toLowerCase() // mengubah huruf kapital menjadi huruf kecil
                .replaceAll("\\p{Punct}", ""); // menghapus tanda baca

        // Membuat variabel untuk menyimpan panjang string
        int length = s.length();

        // Mengecek setiap karakter dari string dari kedua ujungnya
        for (int i = 0; i < length / 2; i++) {
            // Jika karakter di posisi i tidak sama dengan karakter di posisi length - i - 1, maka string bukan palindrome
            if (s.charAt(i) != s.charAt(length - i - 1)) {
                return false;
            }
        }

        // Jika semua karakter cocok, maka string adalah palindrome
        return true;
    }
}
