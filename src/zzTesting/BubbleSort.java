package zzTesting;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 3};

        System.out.println("Array awal:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int i, j;
        for (i = 1; i < arr.length; i++) {
            for (j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            System.out.println("Iterasi ke-" + i + ":");
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }

        System.out.println("Array akhir:");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }
}


