package Alpro;

class Rataarray {
int  arrNilai[];
    public Rataarray(int[] arrNilai) {
        this.arrNilai=arrNilai;
    }
    public void hitungArray(){
        int sum = 0;
        for (int num: arrNilai) {
            sum += num;
        }
        int average = sum / arrNilai.length;
        System.out.println(average);

    }


    public static void main(String[] args) {

        int arrNilai[] = {10, 20, 30, 40, 50};
        Rataarray obj = new Rataarray(arrNilai);
        obj.hitungArray();
    }

}
