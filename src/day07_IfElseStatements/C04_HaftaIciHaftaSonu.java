package day07_IfElseStatements;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_HaftaIciHaftaSonu {

     // Soru; Kullanicidan gun ismini al. Hafta ici veya hafta sonu oldugunu yazdir
     // Ornek; gun=Pazar output="Hafta Sonu"
     //gun=Sali output="Hafta ici"
     // String icin equal methodunu kullan

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir gun girin");
        String gun= scan.next();


        if (gun.equalsIgnoreCase("Pazartesi") || gun.equalsIgnoreCase("Sali") ||gun.equalsIgnoreCase("Carsamba") ||
                gun.equalsIgnoreCase("Persembe") || gun.equalsIgnoreCase("Cuma") ){
            System.out.println("Girdiginiz gun; " + gun + " , Hafta ici bir gundur");
        }

        if (gun.equalsIgnoreCase("Cumartesi") || gun.equalsIgnoreCase("Pazar") ){
            System.out.println("Girdiginiz gun; " + gun + " , Hafta Sonu bir gundur");
        }








    }

}
