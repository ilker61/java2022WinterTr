package day18_nestedForLoop;

import java.util.Scanner;

public class C09_WhileLoopAvantaj {
    public static void main(String[] args) {

        // Kullanicidan istedigi kadar sayi girmesini iste
        // girilen sayi toplami 500 gecerse
        // artik yeter , toplam ... oldu yaz

        int sayi=0;
        int toplam=0;
        Scanner scan=new Scanner(System.in);
        while (toplam<500){
            System.out.println("Sayi gir loo");
            sayi =scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("Artik yeter. Toplam = "+toplam+ " oldu");
    }
}
