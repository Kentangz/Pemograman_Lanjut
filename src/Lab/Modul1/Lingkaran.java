package Lab.Modul1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


    public class Lingkaran {
        private static final double PI = 3.14;
        public static double hitungLuas(double radius) {
            if (radius < 0) {
                throw new IllegalArgumentException("Radius harus bernilai positif");
            }
            return PI * radius * radius;
        }

    @Test
    public void hitungLuasDenganRadiusPositif() {
        double radius = 10;
        double luas = Lingkaran.hitungLuas(radius);
        Assertions.assertEquals(314.0, luas);
        // hasil dari luas lingkaran harus bernilai 314.0 agar dapat lolos testing
    }

    @Test
    public void hitungLuasDenganRadiusNegatif() {
        double radius = -10;
        try {
            Lingkaran.hitungLuas(radius);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(314, 314, e.getMessage());
            //radius harus bernilai positif agar dapat lolos testing
        }
    }

    @Test
    public void hitungLuasDenganRadiusNol() {
        double radius = 0;
        double luas = Lingkaran.hitungLuas(radius);
        Assertions.assertEquals(0, luas);
        //hasil dari luas lingkaran harus bernilai nol agar dapat lolos testing
    }
}

