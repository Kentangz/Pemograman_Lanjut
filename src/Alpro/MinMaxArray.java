package Alpro;

public class MinMaxArray {
    public int arrValue [] ;
    public MinMaxArray(int[] arrValue) {
        this.arrValue = arrValue;
    }
    public void minMax() {
        int min = arrValue[0], max = arrValue[0];
        for (int j : arrValue) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }
        System.out.println("Nilai Minimum: " + min);
        System.out.println("Nilai Maksimum: " + max);
    }
    public static void main(String[] args) {
        int[] arrValue = {1, 2, 7, 4, 8};
        MinMaxArray minMaxArray = new MinMaxArray(arrValue);
        minMaxArray.minMax();
    }
}
