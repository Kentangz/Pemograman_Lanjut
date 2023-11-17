package zzTesting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {1,4,6,7,2,8,3};

        // Urut array dari terkecil ke terbesar
        int minIndex;
        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }

            // Tukar nilai arr[i] dengan arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        // Cetak array yang sudah diurutkan
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

