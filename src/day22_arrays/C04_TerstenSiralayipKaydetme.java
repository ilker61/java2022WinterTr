package day22_arrays;

import java.util.Arrays;

public class C04_TerstenSiralayipKaydetme {
    public static void main(String[] args) {
        // Verilen bir array buyukten kucuge siralayip bize return eden bir method yaz

        int arr[]={3,5,6,1,9,0,45,25,4,9,0};

        arr=terstenSirali(arr);
        System.out.println(Arrays.toString(arr));

        // en boyyuk elemani yazdir

        System.out.println("en boyuk array elemani= " + arr[0]);

        // en guccuk array elemanini yazdir eyle

        System.out.println("en guccuk array elema ni = " + arr[arr.length-1]);
    }

    public static int[] terstenSirali(int[] arr) {
        Arrays.sort(arr);
        int tersArr[]= new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            tersArr[i]= arr[arr.length-1-i];
        }

        return tersArr;
    }
}
