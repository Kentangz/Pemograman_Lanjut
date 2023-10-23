package Lab.Modul1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan angka-angka berupa bilangan bulat dan gunakan spasi untuk memisahkan antar angka" + ": ");
        try {
            String input = scanner.nextLine();
            String[] numbersString = input.split(" ");
            int[] numbers = new int[numbersString.length];

            // Mengubah string menjadi int
            for (int i = 0; i < numbersString.length; i++) {
                numbers[i] = Integer.parseInt(numbersString[i]);
            }
            if (numbers.length == 0) {
            } else {
                int sum = Arrays.stream(numbers).sum();
                double average = sum / numbers.length;
                System.out.println("Rata-rata: " + average);
            }
        } catch (NumberFormatException e) {
            System.out.println("Input yang dimasukkan tidak valid. Mohon masukkan angka yang benar.");
        } catch (InputMismatchException e) {
            System.out.println("Terjadi kesalahan saat membaca input. Mohon coba lagi.");
        } catch (ArithmeticException e) {
            System.out.println("Terjadi pembagian oleh nol. Mohon masukkan angka yang benar.");
        } finally {
            scanner.close();
        }
    }
}

