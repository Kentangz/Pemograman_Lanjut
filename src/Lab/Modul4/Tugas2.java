package Lab.Modul4;
import java.util.Arrays;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        int data [] = {38, -15, 72, 0, -42, 19, -63, 50, 27, -84, 61, 5};
        Arrays.sort(data);
        System.out.println("Data setelah diurutkan: ");
        System.out.println(""+Arrays.toString(data));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai yang ingin dicari indexnya: ");

        int nilai = scanner.nextInt();

        int index = Arrays.binarySearch(data, nilai);
        if (index >= 0) {
            System.out.println("Nilai " + nilai + " ditemukan pada indeks: " + index);
        } else {
            System.out.println("Nilai " + nilai + " tidak ditemukan dalam data.");
        }
        int positiveCount = 0, negativeCount = 0,zeroCount = 0;
        for (int value : data) {
            if (value > 0) {
                positiveCount++;
            } else if (value < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.println("Jumlah elemen dengan nilai positif: " + positiveCount);
        System.out.println("Jumlah elemen dengan nilai negatif: " + negativeCount);
        System.out.println("Jumlah elemen dengan nilai nol: " + zeroCount);
    }
}
