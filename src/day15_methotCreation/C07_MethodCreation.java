package day15_methotCreation;

import java.util.Scanner;

public class C07_MethodCreation {
    public static void main(String[] args) {

        String ad="yasemin yalcin";
        String soyad="sari";
        String kartNo="1234567891112456";

        String gizlenmisIsim=isimSoyisimGizle(ad,soyad);
        System.out.println(gizlenmisIsim);

       String gizlenmisKrediKart= krediKartGizle(kartNo);
        System.out.println(gizlenmisKrediKart);

    }

    private static String krediKartGizle(String kartNo) {
        String yeniKKNo= "**** **** **** " + kartNo.substring(12);
        return yeniKKNo;
    }

    private static String isimSoyisimGizle(String ad, String soyad) {
        String yeniAd= ad.substring(0,1).toUpperCase() + ad.substring(1).replaceAll("\\s", "*");

        String yeniSoyad=soyad.substring(0,1).toUpperCase()+ soyad.substring(1).replaceAll("\\s", "*");
            return yeniAd + " " +yeniSoyad;
    }
}
