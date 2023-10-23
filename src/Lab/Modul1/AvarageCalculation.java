package Lab.Modul1;

public class AvarageCalculation {
    public static void main(String[] args) {
        int [] numbers = {10,20,30,40,50};
        int sum = 0; //harus diinisialisasi dan benilai minimal 0 max -1 dari panjang array
        for (int i = 0; i < numbers.length; i++)   {
            int number = numbers[i];
            // jika i <= number.length akan menyebabkan ArrayIndexOutOfBoundsException (karena numbers.length -1
            sum += number;
        }
        double avarage = sum / numbers.length;
        System.out.println( "Rata-rata : " + avarage);

    }
}
