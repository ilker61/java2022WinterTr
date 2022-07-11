package day21_arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {
        int arr[]; // deger atamasi yapmadik emme java kabul eyledi
                   // ama deger atanmazsa kullanilamaz

        arr=new int[4];
        System.out.println(Arrays.toString(arr)); //[0, 0, 0, 0]

        System.out.println(arr.length);// 4--> arrayin uzunlugunu, eleman sayisini verir

        // arraydeki her bir elemani index degeri kadar artiralim

        for (int i = 0; i < arr.length; i++) {
            arr[i]+=i;
        }
        System.out.println(Arrays.toString(arr));// [0, 1, 2, 3]

    }
}
