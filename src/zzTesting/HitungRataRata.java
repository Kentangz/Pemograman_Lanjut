package zzTesting;

import java.util.Scanner;

public class HitungRataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        // Spesifikasi
        System.out.print("Masukkan jumlah angka yang akan dihitung rata-ratanya: ");

        try {
            n = input.nextInt();

            if (n <= 0) {
                System.out.println("Jumlah angka harus lebih dari 0.");
                return;
            }

            double[] angka = new double[n];

            // Memasukkan angka-angka
            for (int i = 0; i < n; i++) {
                System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
                angka[i] = input.nextDouble();
            }

            // Menghitung rata-rata
            double total = 0;
            for (double num : angka) {
                total += num;
            }

            double rataRata = total / n;
            System.out.println("Rata-rata dari angka-angka tersebut adalah: " + rataRata);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Masukkan yang Anda berikan tidak valid.");
        } finally {
            input.close();
        }
    }
}
