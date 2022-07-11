package day24_arrayList;

import day23_multiDimensionalArrays.C06_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_List {
    public static void main(String[] args) {

        int arr[]={};
        // bu array a 5 ekleyelim

        arr=C06_Array.arrayeElemanEkle(arr,5);
        System.out.println(Arrays.toString(arr));// [5]

        // 3 ekleyelim

        arr=C06_Array.arrayeElemanEkle(arr,3);
        System.out.println(Arrays.toString(arr));// [5, 3]

        // bir list olusturalim

        List<Integer> sayilar=new ArrayList<>();
        System.out.println(sayilar); // []

        sayilar.add(5); // [5]
        sayilar.add(3); // [5, 3]
        sayilar.add(0,7);  // [7,5,3]
        sayilar.add(2, 7);  // [7,5,7,3]
        System.out.println(sayilar); // [7,5,7,3]




    }
}
