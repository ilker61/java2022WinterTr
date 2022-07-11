package day18_nestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class SayiBulmaOyunu {
    public static void main(String[] args) {
        // Bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut yada kucult diye kullaniciya yol gosterin
        // Kullanici sayiyi buldugunda kac tahminde sayiyi
        //buldugunu kullaniciya bildiren bir mesaj yazdirin

        Random rnd=new Random();
        int sayi=rnd.nextInt(100);

        Scanner scan=new Scanner(System.in);
         int tahmin=0;
         int sayac=0;

         while (tahmin!=sayi){
             System.out.println("Tahmin Et ");
             tahmin=scan.nextInt();
             if (tahmin<sayi){
                 System.out.println("daha BUYUK sayi girmelisin");
             } else if (tahmin>sayi){
                 System.out.println(" daha kucuk sayi girmelisin");
             }
             sayac++;
         }
         if (tahmin==sayi){
             System.out.println("Tebrikler "+ sayac + " defada sayiyi buldun");
         }

    }
}
