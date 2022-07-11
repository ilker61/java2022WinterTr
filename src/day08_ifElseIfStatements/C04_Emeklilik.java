package day08_ifElseIfStatements;

import java.util.Scanner;

public class C04_Emeklilik {
  // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir
    // Eger calisan erkekse 65 yasindan buyuk oldugunda emekli olabilir


    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen Cinsiyetinizigirin" +
                "\nKadin icin K, Erkek icin E girin");

        char cinsiyet=scan.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
         double yas= scan.nextDouble();

         if (cinsiyet=='K'){
             if (yas<0 || yas>120){
                 System.out.println("Lutfen girdiginiz yas degerini kontrol edin");
             } else if (yas<60){
                 System.out.println("Emekli olamazsin" + "\nDaha " +(60-yas) + " yil calismalisin");
             }


         } else if (cinsiyet=='E'){{
             if (yas<0 || yas>120){
                 System.out.println("Lutfen girdiginiz yas degerini kontrol edin");
             } else if (yas<65){
                 System.out.println("Emekli olamazsin" + "\nDaha " +(65-yas) + " yil calismalisin");
             }


         }

         }else {
             System.out.println("Lutfen cinsiyet icin gecerli bir durum girin");
         }




    }
}
