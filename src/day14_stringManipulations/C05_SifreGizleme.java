package day14_stringManipulations;

import java.util.Scanner;

public class C05_SifreGizleme {
    public static void main(String[] args) {
        // Soru; Kullanicidan bir sifre iste
        // asagidaki sartlari saglarsa "Sifre basari ile tanimlandi" yazdir
        // Sartlar saglanamazsa "islem basarisiz, lutfen yenni bir sifre girin loo"
        // -ilk harf buyuk olmali
        // -son harf kucuk olmali
        // -sifre bosluk icermemeli
        // -sifre uzunlugu en az 8 karakter olmali

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz loo");
        String sifre = scan.next();

        boolean ilkHarf=false;

        if (sifre.charAt(0)>='A' && sifre.charAt(0)<='Z'){
            ilkHarf=true;
        }else {
            System.out.println("sifrenin ilk harfi buyuk olacahhh");
        }

        boolean sonHarf=false;

        if (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z' ){

            sonHarf=true;
        }else {
            System.out.println("sifrenin son harfi kucuk olacahhh");
        }

        boolean space=false;

        if (sifre.contains("")){
            space=true;
        } else {
            System.out.println("sifre bosluh icermeyecaahh");
        }

        boolean karakter=false;

        if (sifre.length()>=8){
            karakter=true;
        } else {
            System.out.println("sifrenin en az 8 karakteri olacahh");
        }

        if (ilkHarf && sonHarf && space && karakter){
            System.out.println("Sifre basari ile tanimlandi");
        }



    }
}