package day22_arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class C03_BuyuktenKucugeSirala {
    public static void main(String[] args) {
        // Verilen bir array buyukten kucuge siralayip yazdiran bir method yaz

        int arr[]={3,5,6,1,9,0,45,25,4,9,0};

        terstenSiralaYazdir(arr);

    }

    public static void terstenSiralaYazdir(int[] arr) {
       Arrays.sort(arr);
       int tersArr[]= new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            tersArr[i]= arr[arr.length-1-i];
        }

        System.out.println(Arrays.toString(tersArr));

    }
}
