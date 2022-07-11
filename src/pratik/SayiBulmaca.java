package pratik;

import java.util.Random;
import java.util.Scanner;

public class SayiBulmaca {
    public static void main(String[] args) {
        // Bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut yada kucult diye kullaniciya yol gosterin
        // Kullanici sayiyi buldugunda kac tahminde sayiyi
        //buldugunu kullaniciya bildiren bir mesaj yazdirin

        Random rnd= new Random();
        int sayi=rnd.nextInt(100);// burasi 100 den kucuk bir sayi olusturur

        Scanner scan=new Scanner(System.in);
        int sayac=0;
        int tahmin=0;

        while (tahmin!=sayi){
            System.out.println("Tahmin Et ");
            tahmin=scan.nextInt();
            if (tahmin<sayi){
            System.out.println("daha BUYUK sayi girmelisin bro");

            } else if (tahmin>sayi){
            System.out.println("daha kucuk sayi girmelisin bro");
            }
            sayac++;


        }

        if (tahmin==sayi){
            System.out.println("Tebrikler "+ sayac+ " defada sayiyi buldunuz");
        }


    }
}
