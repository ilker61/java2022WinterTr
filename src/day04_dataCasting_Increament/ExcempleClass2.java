package day04_dataCasting_Increament;

import java.util.Random;
import java.util.Scanner;

public class ExcempleClass2 {
    public static void main(String[] args) {

        Random rnd =new Random();
        int sayi=rnd.nextInt(100);

        Scanner scan=new Scanner(System.in);
        int tahmin= 0;
        int sayac=1;

        while (sayi!=tahmin){
            System.out.println("Lutfen bir sayi girin");
            tahmin=scan.nextInt();

            if (tahmin>sayi){
                System.out.println("Daha kucuk bir sayi girmelisin");
            } else if (tahmin<sayi) {
                System.out.println("Daha buyuk bir sayi girmelisin");
            }
            sayac++;

        }

        System.out.println("Sayiyi " + sayac+". tahmininizde buldunuz");




    }
}
