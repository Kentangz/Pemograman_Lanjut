package zzTesting;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    public static List<String> quickSort(List<String> names) {
        if (names.size() <= 1) {
            return names;
        } else {
            // Pilih pivot dengan pendekatan yang lebih canggih jika diinginkan
            String pivot = names.get(0);
            List<String> less = new ArrayList<>();
            List<String> equal = new ArrayList<>();
            List<String> greater = new ArrayList<>();

            for (int i = 1; i < names.size(); i++) {
                String currentName = names.get(i);
                if (currentName.compareTo(pivot) < 0) {
                    less.add(currentName);
                } else if (currentName.compareTo(pivot) == 0) {
                    equal.add(currentName);
                } else {
                    greater.add(currentName);
                }
            }

            List<String> sortedList = new ArrayList<>();
            sortedList.addAll(quickSort(less));
            sortedList.addAll(equal);
            sortedList.add(pivot);
            sortedList.addAll(quickSort(greater));

            return sortedList;
        }
    }

    public static void main(String[] args) {
        // Contoh penggunaan
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Eava");
        names.add("Ebva");
        names.add("Ecva");
        names.add("Edva");

        List<String> sortedNames = quickSort(names);

        // Tampilkan hasil pengurutan
        System.out.println("Sorted Names: " + sortedNames);
    }
}

