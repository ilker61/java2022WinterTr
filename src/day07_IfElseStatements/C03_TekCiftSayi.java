package day07_IfElseStatements;

import java.util.Scanner;

public class C03_TekCiftSayi {

    // Kullanicidan bir sayi iste, bu sayinin tek  mi cift mi oldugunu yaziver

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi= scan.nextInt();

        if (sayi%2==0){
            System.out.println("Girdiginiz sayi= " + sayi + " , cift bir sayidir");
        }

        if (sayi%2!=0){
            System.out.println("Girdiginiz sayi= " + sayi + " , tek bir sayidir");
        }

    }
}
