package day22_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_Sort {
    public static void main(String[] args) {
        // Verilen bir arrayde en buyuk ve en kucuk degerleri yazdir

        int arr[]={3,5,6,1,9,0,45,25,4,9,0};

      int enKucukSayi=Integer.MAX_VALUE;
      int enBuyukSayi=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<enKucukSayi){
                enKucukSayi=arr[i];
            }
            if (arr[i]>enBuyukSayi){
                enBuyukSayi=arr[i];
            }
        }
        System.out.println("En kucuk sayi = " + enKucukSayi); // 0
        System.out.println("En buyuk sayi = " + enBuyukSayi); // 45

        // Sorunun sort methodu ile icrasi

        Arrays.sort(arr);

        System.out.println("En kucuk eleman = " + arr[0]); // 0
        System.out.println("En buyuk eleman = " + arr[arr.length-1]); // 45


    }
}
