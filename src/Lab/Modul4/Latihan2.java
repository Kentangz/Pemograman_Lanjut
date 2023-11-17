package Lab.Modul4;

import java.util.Scanner;

public class Latihan2 {
    private String teks;

    private void menupilih() {
        System.out.println("=== MENU TEKS ANALYZER ===");
        System.out.println("1. Masukkan Teks");
        System.out.println("2. Hitung Jumlah Karakter");
        System.out.println("3. Hitung Jumlah Kata");
        System.out.println("4. Cari Kata dalam Teks");
        System.out.println("5. Keluar");
    }

    private void pilihmenu() {
        Scanner input = new Scanner(System.in);
        int pilih;
        boolean pilihmenupilih = true;

        while (pilihmenupilih) {
            menupilih();
            System.out.print("Pilih menu: ");
            pilih = input.nextInt();
            input.nextLine(); // consume newline

            switch (pilih) {
                case 1:
                    inputText(input);
                    break;
                case 2:
                    jumlahkarakter();
                    break;
                case 3:
                    jumlahkata();
                    break;
                case 4:
                    mencarikata(input);
                    break;
                case 5:
                    pilihmenupilih = false;
                    System.out.println("Program selesai!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
        input.close();
    }

    private void inputText(Scanner scanner) {
        System.out.print("Masukkan teks: ");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            System.out.println("Teks tidak boleh kosong!");
        } else {
            teks = input;
            System.out.println("Teks berhasil disimpan!");
            System.out.println("Teks yang dimasukkan: " + teks);
        }
    }

    private void jumlahkarakter() {
        if (teks != null) {
            int jumlahchar = teks.length();
            System.out.println("Jumlah karakter: " + jumlahchar);
        } else {
            System.out.println("Masukkan teks terlebih dahulu!");
        }
    }

    private void jumlahkata() {
        if (teks != null) {
            String[] kata = teks.split("\\s+");
            int jumlah = kata.length;
            System.out.println("Jumlah kata: " + jumlah);
        } else {
            System.out.println("Masukkan teks terlebih dahulu!");
        }
    }

    private void mencarikata(Scanner scanner) {
        if (teks != null) {
            System.out.print("Cari kata: ");
            String carikata = scanner.nextLine();
            boolean sama = false;
            int jumlahkataditemukan = 0;

            for (String word : teks.split("\\s+")) {
                if (word.equalsIgnoreCase(carikata)) {
                    sama = true;
                    jumlahkataditemukan++;
                }
            }
            if (sama) {
                System.out.println("Kata '" + carikata + "' ditemukan sebanyak " + jumlahkataditemukan + " kali!");
            } else {
                System.out.println("Kata '" + carikata + "' tidak ditemukan!");
            }
        } else {
            System.out.println("Masukkan teks terlebih dahulu!");
        }
    }
    public static void main(String[] args) {
        Latihan2 latihan2 = new Latihan2();
        latihan2.pilihmenu();
    }
}


