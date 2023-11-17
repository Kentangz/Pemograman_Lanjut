package zzTesting;

import java.util.Scanner;

public class Kalkulator1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean menu = true;
        while (menu){
        System.out.println("** Kalkulator **");
        System.out.println("1. Akar Kuadrat");
        System.out.println("2. Pangkat");
        System.out.println("3. Logaritma Natural");
        System.out.println("4. Faktorial");
        System.out.println("5. exit");

        System.out.print("Pilih operasi: ");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan bilangan: ");
                double bilangan = input.nextDouble();
                double akar = Math.sqrt(bilangan);
                System.out.print("Akar kuadrat dari " + bilangan + " adalah " + akar);
                break;
            case 2:
                System.out.print("Masukkan bilangan: ");
                double bilangan1 = input.nextDouble();
                System.out.print("Masukkan pangkat: ");
                int pangkat = input.nextInt();
                double hasil = Math.pow(bilangan1, pangkat);
                System.out.print(bilangan1 + " pangkat " + pangkat + " adalah " + hasil);
                break;
            case 3:
                System.out.print("Masukkan bilangan: ");
                double bilangan2 = input.nextDouble();
                double logaritma = Math.log(bilangan2);
                System.out.print("Logaritma natural dari " + bilangan2 + " adalah " + logaritma);
                break;
            case 4:
                System.out.print("Masukkan bilangan: ");
                int bilangan3 = input.nextInt();
                int faktorial = 1;
                for (int i = 1; i <= bilangan3; i++) {
                    faktorial *= i;
                }
                System.out.print("Faktorial dari " + bilangan3 + " adalah " + faktorial);
                break;
            case 5:
                menu = false;
                System.out.println("makasih");

            default:
                System.out.println("^-^");
                break;
        }
    }
}}

