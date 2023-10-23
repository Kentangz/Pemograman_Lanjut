package zzTesting;

import java.util.*;

class contohBubbleSort
{
    int arrNilai[];

    public contohBubbleSort(int[] arrNilai) {
        this.arrNilai = arrNilai;
    }
    public void methodBubbleSort()
    {
        for(int i=1; i<arrNilai.length; i++)
        {
            System.out.println("iterasi ke : "+i);
            for(int j=0; j<arrNilai.length-1; j++)
            {
                if(arrNilai[j]>arrNilai[j+1])
                {
                    int temp;
                    temp = arrNilai[j];
                    arrNilai[j] = arrNilai[j+1];
                    arrNilai[j+1] = temp;
                }
                System.out.println(Arrays.toString(arrNilai));
            }
        }
    }
}
public class exBubbleSort {
    public static void main(String[] args)
    {
        int arrNilai[] = {6,5,4,3,2,1};
        contohBubbleSort obj = new contohBubbleSort(arrNilai);
        obj.methodBubbleSort();
    }
}

