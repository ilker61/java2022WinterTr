package day22_arrays;

import java.util.Arrays;

public class PratikArrayiTerseCevirme {
    public static void main(String[] args) {
        int arr[]={1,5,7,9,23,45,67,0,12,3,4,8};

        // Verilen aarayin elemanlarini buyukten kucuge yazdiran bir method yaz

        System.out.println("Verilen Array = "+ Arrays.toString(arr));

        terseCevir(arr);

    }

    private static void terseCevir(int[] arr) {
        Arrays.sort(arr);
        int arrTers[]= new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrTers[i]=arr[arr.length-1-i];
        }
        System.out.println("Buyukten kucuge siranalmis Array= "+Arrays.toString(arrTers));
    }
}
