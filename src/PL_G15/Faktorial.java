package PL_G15;

public class Faktorial {
    public static int factorial(int x) {
    if (x < 0) {
        throw new IllegalArgumentException("Angka harus positif");
    }

    int result = 1;
    for (int i = 1; i <= x; i++) {
        result *= i;
    }

    return result;
}

    public static void main(String[] args) {
        int x = 6;
        int y;

        try {
            y = factorial(x);
        } catch (IllegalArgumentException e) {
            System.out.println("Angka harus positif");
            return;
        }

        System.out.println("Nilai faktorial dari " + x + " adalah " + y);
    }


}
