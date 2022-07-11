package day23_multiDimensionalArrays;

import java.sql.Array;
import java.util.Arrays;

public class C03_MDArrays {
    public static void main(String[] args) {
        //Boyutlari belli bir arrayi elementleri girmeden olusturalim
        // Bir okukda icinde 24 ogrenci olan 8 sinif vardir

        int arr[][]= new int[8][24];
        System.out.println(Arrays.deepToString(arr));

        // Bir ilcede herbirinde 24 ogrencilik 8 sinif bulunan 5 okul vardir

        int arr1[][][]= new int[5][8][24];

        //

    }
}
