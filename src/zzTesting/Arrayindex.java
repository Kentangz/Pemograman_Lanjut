package zzTesting;

public class Arrayindex {
    public static void main(String[] args) {
        int arr[] = new int[2];
        try {
            arr[2] = 5;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" index melebihi batas");
        }
        }
}



