package zzTesting;
import java.util.Arrays;

class SortingArray {
    public static void main(String args[])
    {
        int[]arr = { 5, 2, 23, 7, 87, 42, 509 };
        Arrays.sort(arr,1,5);
        System.out.printf("\nmoified array [] %s" , Arrays.toString(arr));
        }

    }

