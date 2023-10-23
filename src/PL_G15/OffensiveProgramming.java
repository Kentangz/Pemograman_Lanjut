package PL_G15;

public class OffensiveProgramming {
    public static void main(String[] args) {
        int angka = -5;
        if (angka > 0) {
            int akar = (int) Math.sqrt(angka);
            System.out.println("Akar kuadrat dari " + angka + " adalah " + akar);
        } else {
            System.out.println("Input harus bilangan bulat positif.");
        }
    }
}

