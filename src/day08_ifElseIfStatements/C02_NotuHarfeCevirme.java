package day08_ifElseIfStatements;

import java.util.Scanner;

public class C02_NotuHarfeCevirme {

    //Soru= Kullanicidan 100 uzerinden notunu iste
    // Notu harf sistemine cevirip yazdirin
    //50 den kucuk ise "D"
    //50-60 arasi ise "C"
    //60-80 arasi"B"
    // 80 uzeri ise "A"

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen notunuzu girin");


        double notSayi= 0;


            notSayi = scan.nextDouble();



        if(notSayi<0 || notSayi>100){
           System.out.println("Lutfen gecerli bir not girin");
        }
        else if (notSayi<50){
            System.out.println("Notunuz D");
        } else if (notSayi>=50 && notSayi<60){
            System.out.println("Notunuz C");
        } else if (notSayi>=60 && notSayi<80) {
            System.out.println("Notunuz B");
        } else {
            System.out.println("Notunuz A");
        }





    }



}
