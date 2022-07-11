package day15_methotCreation;

import java.util.Scanner;

public class C02_MethotCreation {

    public static void main(String[] args) {

        // Kullanicidan bir kelime iste
        // eger kelime uc harften kisa ise "kelime cok kisa ya la"
        // 3,4 veya 5 harfli ise harf sayisini yaz
        //  ve kelimenin tersten yazilisini yaz
        // 5 harften uzunsa "kelime cok uzun ya la"

        Scanner scan =new Scanner(System.in);
        System.out.println("Litfin bir kilime girin");
        String kelime=scan.next();
        int harfSayisi= kelime.length();

        if (harfSayisi<3){
            System.out.println("kelime cok kisa ya laoo");
        } else if (harfSayisi==3){
            ucHarfiTersineCevir(kelime);
        } else if (harfSayisi==4){
            dortHarfiTersineCevir(kelime);
        } else if (harfSayisi==5){
            besHarfiTersineCevir(kelime);
        } else {
            System.out.println("kelime cok uzun, baydi ya laa");
        }


    }

    public static void ucHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(2) +
                kelime.substring(1,2) +
                kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayisi : " +kelime.length());
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);
    }

    public static void dortHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(3) +
                kelime.substring(2,3) +
                kelime.substring(1,2) +
                kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayisi : " +kelime.length());
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);
    }

    public static void besHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(4) +
                kelime.substring(3,4) +
                kelime.substring(2,3) +
                kelime.substring(1,2) +
                kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayisi : " +kelime.length());
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);
    }


}
