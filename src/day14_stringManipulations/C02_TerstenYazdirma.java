package day14_stringManipulations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C02_TerstenYazdirma {
    public static void main(String[] args) {
        // Soru; Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 harfli bir kelime girin");

        String kelime=scan.nextLine();

        String tersKelime=kelime.substring(3) +
                           kelime.substring(2,3) +
                             kelime.substring(1,2) +
                               kelime.substring(0,1);
        System.out.println(tersKelime);


    }
}
