package day11_stringManipulation;

import java.util.Scanner;

public class C04_Length {
    public static void main(String[] args) {
        // Kullanicidan ismini alip bas harfini ve son harfini buyuk harflerle yazdir

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen isminizi girin");
        String isim= scan.nextLine();

        System.out.println("Ilk Harf : " + isim.toUpperCase().charAt(0));
        System.out.println("Son harf : " + isim.toUpperCase().charAt(isim.length()-1));

    }
}
