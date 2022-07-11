package day12_stringManipulations;

import java.util.Scanner;

public class C05_replaceAll {

    // Kullanicidan isim soy isim bilgisi al
    // butun harfleri * yapalim

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen adinizi ve soy adinizi giriverin gaari");
        String isim=scan.nextLine();

        System.out.println(isim.replaceAll("\\S", "*"));

    }

}
