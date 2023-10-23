package Alpro;

public class SumArrayTwoDimension {
    public int arrValue [][] ;
    public SumArrayTwoDimension(int[][] arrValue) {
        this.arrValue = arrValue;
    }
    public void tampilData() {
        for (int i = 0; i < arrValue.length; i++) {
            for (int j = 0; j < arrValue[i].length; j++) {
                System.out.print(arrValue[i][j] + " ");
            }
            System.out.println();
        }
    }
    public int prosesJumlah() {
        int sum = 0;
        for (int i = 0; i < arrValue.length; i++) {
            for (int j = 0; j < arrValue[i].length; j++) {
                sum += arrValue[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] arrVarSum = {
                {4, 8, 2, 1},
                {9, 3, 5, 7},
                {1, 3, 6, 8}};
        SumArrayTwoDimension obj = new SumArrayTwoDimension(arrVarSum);
        System.out.println("Array Multidimensi:");
        obj.tampilData();
        int totalSum = obj.prosesJumlah();
        System.out.println("Jumlah seluruh angka dalam Array Multidimensi: " + totalSum);
    }
}

