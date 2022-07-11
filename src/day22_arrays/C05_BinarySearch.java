package day22_arrays;

import java.util.Arrays;

public class C05_BinarySearch {
    public static void main(String[] args) {
       // verilen arrayde istenen bir elemanin var olup olmadigini gosteren bir method yaz
        // ISTENEN SAYI 5



        int arr[]={3,5,6,1,9,45,25,4,9,0};
        int istenenSayi=1;
        istenenSayiBul(arr, istenenSayi);

    }

    private static void istenenSayiBul(int[] arr, int istenenSayi) {

        boolean sonuc=false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==istenenSayi){
                sonuc=true;
                break;
            }

        }
        System.out.println(sonuc);



    }


}

