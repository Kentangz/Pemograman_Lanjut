package zzTesting;

import java.util.Scanner;
public class Kalkulator {
static class AkarKuadrat {

    public double hitung(double bilangan) {
        return Math.sqrt(bilangan);
    }
}

    static class Pangkat {

    public double hitung(double bilangan, int pangkat) {
        return Math.pow(bilangan, pangkat);
    }
}
    static class LogaritmaNatural {
    public double hitung(double bilangan) {
        return Math.log(bilangan);
    }
}
    static class Faktorial {
    public int hitung(int bilangan) {
        int hasil = 1;
        for (int i = 1; i <= bilangan; i++) {
            hasil *= i;
        }
        return hasil;
    }
}


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            boolean isRunning = true;

            while (isRunning) {
                System.out.println("** Kalkulator **");
                System.out.println("1. Akar Kuadrat");
                System.out.println("2. Pangkat");
                System.out.println("3. Logaritma Natural");
                System.out.println("4. Faktorial");
                System.out.println("5. Keluar");
                System.out.println("Pilih operasi: ");
                int pilihan = input.nextInt();

                switch (pilihan) {
                    case 1:
                        AkarKuadrat akarKuadrat = new AkarKuadrat();
                        System.out.println("masukan bilangan");
                        double bilangan = input.nextDouble();
                        double hasil = akarKuadrat.hitung(bilangan);
                        System.out.println("Akar kuadrat dari " + bilangan + " adalah " + hasil);
                        break;
                    case 2:
                        Pangkat pangkat = new Pangkat();
                        System.out.println("Masukkan bilangan: ");
                        double bilangan1 = input.nextDouble();
                        System.out.println("Masukkan pangkat: ");
                        int pangkat1 = input.nextInt();
                        double hasil1 = pangkat.hitung(bilangan1, pangkat1);
                        System.out.println(bilangan1 + " pangkat " + pangkat1 + " adalah " + hasil1);
                        break;
                    case 3:
                        LogaritmaNatural logaritmaNatural = new LogaritmaNatural();
                        System.out.println("Masukkan bilangan: ");
                        double bilangan2 = input.nextDouble();
                        double hasil2 = logaritmaNatural.hitung(bilangan2);
                        System.out.println("Logaritma natural dari " + bilangan2 + " adalah " + hasil2);
                        break;
                    case 4:
                        Faktorial faktorial = new Faktorial();
                        System.out.println("Masukkan bilangan: ");
                        int bilangan3 = input.nextInt();
                        int hasil3 = faktorial.hitung(bilangan3);
                        System.out.println("Faktorial dari " + bilangan3 + " adalah " + hasil3);
                        break;
                    case 5:
                        isRunning = false;
                        System.out.println("Terima kasih telah menggunakan kalkulator kami.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid!");
                }
            }
        }
    }





