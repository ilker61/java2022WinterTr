package day11_stringManipulation;

import java.util.Scanner;

public class C05_IndexOf {
    public static void main(String[] args) {
        String str1= "Java bir baska guzel";

        System.out.println(str1.indexOf('J')); // 0

        System.out.println(str1.indexOf("l")); //19

        System.out.println(str1.indexOf("aska")); // 10

        System.out.println(str1.indexOf("b")); // 5 ==> ayni harften birden fazla varsa ilk buldugunun indexini verir

        System.out.println(str1.indexOf('b',5)); // 5 de dahil olmak uzere arama yapar ve b nin indexini getiri


        // verilen stringteki 2. a harfinin indexini bul

        int ilkHarfIndex= str1.indexOf("a");
        System.out.println(ilkHarfIndex);// 1
        int ikinciHarfIndex= str1.indexOf("a",ilkHarfIndex+1);
        System.out.println(ikinciHarfIndex); // 3


        //verilen stringteki 2. b harfinin indexini bul

        int ilkBharfIndex= str1.indexOf("b");
        int ikinciBharfIndex= str1.indexOf("b", ilkBharfIndex+1);
        System.out.println(ikinciBharfIndex);


        // Stringte olmayan bir harf arasak

        System.out.println(str1.indexOf("x"));  // -1
                                                // Olmayan bir karakterin indexi -1 dir

        //Kullanicidan mail adresini iste
        // @ isareti icermiyorsa "Gecersiz" yazdir
        // iceriyorsa "Mailiniz kabul edildi" yazdir

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen mailinizi giriniz");
        String mail= scan.next();

        System.out.println(mail.indexOf("@")==-1? "Gecersiz" :"Mailiniz kabul edildi" );




    }
}
