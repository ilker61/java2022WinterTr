package day18_nestedForLoop;

import java.util.Scanner;

public class C08_WhilLoopVSforloop {
    public static void main(String[] args) {
        // Kullanicidan toplamak istedigi sayilari al
        // Kullanici 0 a basan kadar devam et
        // Kullanici 0 a basinca tum sayilarin toplamini yaz



        // 1. YOL

       /* Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;

        for (int i = 0; i < 1000000; i++) {
            System.out.println("Lutfen toplamak istedigini sayiyi girin");
            sayi=scan.nextInt();
           if (sayi==0){
               break;
           }else {
               toplam+=sayi;
           }
        }
        System.out.println(toplam);
        System.out.println("");
        */

        // 2. YOL

        int sayi=1;
        int toplam=0;
        Scanner scan=new Scanner(System.in);

        while (sayi!=0){
            System.out.println("Lutfen toplamak istedigini sayiyi girin");
            sayi=scan.nextInt();
            toplam+=sayi;
        }
        System.out.println(toplam);

        // Baslangic, bitis ve degisim degerleri belli olan durumlarda
        // for loop daha uygundur

        // Ama adim sayisi belli olmayan durumlarda while Loop daha avantajli

    }
}
