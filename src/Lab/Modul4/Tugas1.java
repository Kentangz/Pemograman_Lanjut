package Lab.Modul4;
import java.util.Random;
import java.util.Scanner;

public class Tugas1 {
    public static void randomnumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan batas bawah: ");
        int bawah = scanner.nextInt();

        System.out.print("Masukkan batas atas: ");
        int atas = scanner.nextInt();

        Random random = new Random();
        int randomNumber = random.nextInt(atas - bawah+1) + bawah;

        System.out.println("Angka acak: " + randomNumber);
    }

    public static void randomstring() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang string: ");
        int length = scanner.nextInt();

        Random random = new Random();
        StringBuilder randomString = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            char randomChar = characters.charAt(index);
            randomString.append(randomChar);
        }
        String a = randomString.toString();
        System.out.println("String acak: " + a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Random Angka");
            System.out.println("2. Random String");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi (1/2/3): ");

            int pilih = scanner.nextInt();

            switch (pilih) {
                case 1:
                    randomnumber();
                    break;
                case 2:
                    randomstring();
                    break;
                case 3:
                    System.out.println("Terima kasih! Program keluar.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }


}

