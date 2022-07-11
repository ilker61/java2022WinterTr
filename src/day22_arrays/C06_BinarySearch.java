package day22_arrays;

import java.util.Arrays;

public class C06_BinarySearch {
    public static void main(String[] args) {
        int arr[]={3,5,6,6,1,9,45,25,4,9,0};
        int istenenSayi=6;

        // Eger bu soruyu BinarySearch ile yapmak istersek
        // once sort methodu kullanilmalidir

        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, istenenSayi));

        // arranan elemanin sort yapildiktan sonraki indexi verir


    }
}
