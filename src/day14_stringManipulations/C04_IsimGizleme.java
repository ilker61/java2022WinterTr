package day14_stringManipulations;

import java.util.Scanner;

public class C04_IsimGizleme {
    public static void main(String[] args) {
        //Soru; Kullanicidan ismini alin, soy isim ve kredi karti bilgilierini iste
        // isim-Soyisim : M***+* B*****
        // Kart No : **** **** **** 4527    seklinde yazdir

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen adinizi girin");
        String ad=scan.nextLine().toUpperCase();
        String soyad=scan.next().toUpperCase();
        String kartNo="1234567891112456";

        System.out.println("Isim - Soyisim : " + ad.substring(0,1)+ad.substring(1).replaceAll("\\w", "*")
                           + "  "+soyad.substring(0,1)+ soyad.substring(1).replaceAll("\\w","*")
                           + ("\nKart No    :    " +kartNo.substring(0,12).replaceAll("\\w", "*") + kartNo.substring(12) ));
    }
}
