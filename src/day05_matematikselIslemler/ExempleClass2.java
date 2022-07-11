package day05_matematikselIslemler;

import java.util.Scanner;

public class ExempleClass2 {
    // Kullanicidan aldiginiz 4 basamakli sayinin rakamlar toplamini bulun

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen 4 basmakli bir tam sayi giri");
        int sayi=scan.nextInt();

        int rakam;
        int rakamlarToplami=0;

        rakam=sayi%10;  // rakam=7
        rakamlarToplami+=rakam;   // rakamlar toplami=7
        sayi=sayi/10;   // sayi=452

        rakam=sayi%10;    // rakam=2
        rakamlarToplami+=rakam;  // rakamlar tolplami=9
        sayi=sayi/10;   // sayi= 45

        rakam=sayi%10;  // rakam=5
        rakamlarToplami+=rakam;   // rakamlar tooami = 14
        sayi=sayi/10;   // sayi=4

        rakam=sayi%10;  // rakam=4
        rakamlarToplami+=rakam;  // rakamlar toplami = 18
        sayi=sayi/10;   // sayi=0


        System.out.println( "Girilen sayinin rakamlar toplami= " + rakamlarToplami);








    }


}
