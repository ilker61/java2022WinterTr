package day08_ifElseIfStatements;

import java.util.Scanner;

public class C03_SayiKontrol {
    // Kullanicidan iki sayi isteyin
    // Sayilarin ikiside pozitif ise sayilarin toplamini yazdirin
    // Sayilarin ikisi de negatif ise sayilarin carpimini yazdirin
    // sayilarin ikiside farkli isaretlere sahipse
    // "farkli isaretlere sahip sayilarla islem yapilamaz" yazdir

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki sayi girin");

        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();

        if (sayi1>0 && sayi2>0){
            System.out.println("Girdiginiz iki sayida pozitif: " +(sayi1+sayi2));
        } else if (sayi1<0 && sayi2<0){
            System.out.println("Girdiginiz iki sayida negatif: " +(sayi1*sayi2));
        } else if (sayi1*sayi2<0){
            System.out.println("farkli isaretlere sahip sayilarla islem yapilamaz");
        } else {
            System.out.println("sayilardan 0 a esit olan var, 0 yutan elemandir");
        }



    }
}
