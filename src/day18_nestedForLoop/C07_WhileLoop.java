package day18_nestedForLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {
        // Kullanicidan toplamak uzerer 5 sayi alin
        // Bu sayilarin toplamini ekrana yazdir

        int sayiAdedi=5;
        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;

        // 1. YOL

        for (int i = 1; i <=sayiAdedi ; i++) {
            System.out.println("Lutfen toplamak istedigini sayiyi girin");
            sayi=scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("Girilen " + sayiAdedi + " sayinin toplami = " + toplam);
        System.out.println("");

        // 2. YOL
        sayi=0;
        toplam=0;
        int sayac=1;

        while (sayac<=sayiAdedi){
            System.out.println("Bir sayi gir");
            sayi=scan.nextInt();
          toplam+=sayi;
          sayac++;
        }
        System.out.println("Girilen " + sayiAdedi + " sayinin toplami = " + toplam);


    }
}
