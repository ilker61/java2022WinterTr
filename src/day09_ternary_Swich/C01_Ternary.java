package day09_ternary_Swich;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        // Ternary ile yapilan tum islemler if else ile de yapilabilir
        // Ternary tercih edilmesinin nedeni basit ve anlasilabilir olmasidir
        //Ternary icerisinde komplex yapi olmaz
        //  sadece sonuc ve bizi sonuca goturen basit islemler olabilir
        //  Syntex ==>  condition ? Code1 : Code2
        //         ==>  sayi%2==0 ? "Sayi cift" : "Sayi Tek"


       // Kulanicidan sayi al, tek mi cift mi yazdir

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen pozitif bir sayi girin");

        int sayi=scan.nextInt();

        System.out.println(sayi%2==0 ? "Sayi cift" : "Sayi Tek");


    }
}
