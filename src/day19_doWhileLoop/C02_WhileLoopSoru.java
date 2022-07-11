package day19_doWhileLoop;

import java.util.Scanner;

public class C02_WhileLoopSoru {
    public static void main(String[] args) {
        // Kullanicidan bir sayi alin ve
        // bu sayinin rakamlari toplamini yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir sayi girin");
        int sayi=scan.nextInt();

        int rakamToplami=0;
        int rakam=0;


        while (sayi>0){
            rakam=sayi%10;
            rakamToplami+=rakam;
            sayi/=10;

        }
        System.out.println("girdiginiz sayinin rakamlar toplami ="+ rakamToplami );

    }
}
