package day04_dataCasting_Increament;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

        // Soru 7) Kullanicidan ismini alip isminin bas harfini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen adinizi girin");
        char basHarf=scan.next().toUpperCase().charAt(0);
        System.out.println(basHarf);

    }
}
