package day19_doWhileLoop;

import java.util.Scanner;

public class C03_D0WhileLoop {
    public static void main(String[] args) {

        /// Kullanicidan bir sayi alin ve
        // bu sayinin rakamlari toplamini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi gir");
        int sayi=scan.nextInt();

        int rakamToplami=0;
        int rakam=0;

        do {
            rakam=sayi%10;
            rakamToplami+=rakam;
            sayi/=10;

        } while (sayi>0);

        System.out.println(rakamToplami);
    }
}
