package pratik;

import java.util.Scanner;

public class SayiToplami {
    public static void main(String[] args) {
        // Kullanicidan toplamak uzerer 5 sayi alin
        // Bu sayilarin toplamini ekrana yazdir

        int sayiAdedi=5;
        int toplam=0;
        int sayi=0;

        Scanner scan=new Scanner(System.in);

        for (int i = 1; i <= sayiAdedi; i++) {
            System.out.println("Toplamak istediginiz sayiyi gir loo");
            toplam+=scan.nextInt();
        }
        System.out.println("Girdigin " +sayiAdedi +" sayinin toplami= "+toplam);

    }
}
