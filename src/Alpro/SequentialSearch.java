package Alpro;

public class SequentialSearch {
    public static int sequentialSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Mengembalikan indeks jika ditemukan
            }
        }
        return -1; // Mengembalikan -1 jika tidak ditemukan
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 6;

        int result = sequentialSearch(array, target);

        if (result != -1) {
            System.out.println("Elemen " + target + " ditemukan di indeks " + result);
        } else {
            System.out.println("Elemen " + target + " tidak ditemukan dalam array");
        }
    }
}

